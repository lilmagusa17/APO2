package src.model;

public class BSTNode implements Tree {

    private BSTNode left;
    private BSTNode right;

    private BSTNode parent;

    private NodeType type;
    private Comparable value;

    public BSTNode(BSTNode left, BSTNode right, NodeType type, Comparable value) {
        this.left = left;
        this.right = right;
        this.type = type;
        this.value = value;
    }

    public BSTNode(Comparable value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.type = NodeType.LEAF;
    }

    public BSTNode(Comparable value, BSTNode pa) {
        this.value = value;
        this.left = null;
        this.right = null;
        type = NodeType.LEAF;
        parent = pa;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getParent() {
        return parent;
    }

    public void setParent(BSTNode parent) {
        this.parent = parent;
    }

    public Comparable getValue() {
        return value;
    }

    public void setValue(Comparable value) {
        this.value = value;
    }

    public void add(Comparable n) {
        switch (type) {
            case LEAF:
                BSTNode newNode = new BSTNode(n);
                int compValue = value.compareTo(n);
                if (0 <= compValue) {
                    this.left = newNode;
                    newNode.setParent(this);
                }else {
                    this.right = newNode;
                    newNode.setParent(this);
                }
                type=NodeType.BRANCH;
                break;
            case BRANCH:
                addBranch(n);
                break;

        }
    }

    private void addBranch(Comparable n){
        int compValue = value.compareTo(n);
        if (compValue >= 0) {
            if(left != null){
                left.add(n);
            }else{
                left = new BSTNode(n, this);
            }

        }else {
            if(right != null){
                right.add(n);
            }else{
                right = new BSTNode(n, this);
            }
        }
    }

    @Override
    public Object search(Comparable n) {
        Object found = null;
        if(value.equals(n)){
            found = this;
        }else{
            switch (type) {
                case LEAF:
                    found = null;
                    break;
                case BRANCH:
                    int compValue = value.compareTo(n);
                    if (compValue >= 0) {
                        if(left != null){
                            found = left.search(n);
                        }
                    } else {
                        if(right != null){
                            found = right.search(n);
                        }
                    }
                    break;
            }
        }

        return found;
    }

    public int searchLevel(Comparable n){
        return searchLevelAcc(n, 0);
    }

    private int searchLevelAcc(Comparable n, int level){
       int ans=0;
       if(value.equals(n)){
           ans = level;
       }else{
           switch (type){
               case LEAF:
                   ans = -1;
                   break;

               case BRANCH:
                   //if n is less than the value of the node
                   if(value.compareTo(n)>=0){
                       //if left subtree isn't empty
                       if(left!=null) {
                           ans = left.searchLevelAcc(n, level + 1);
                       }
                   }else { // n is greater than the value of the node
                       //if right subtree isn't empty
                       if (right != null) {
                           ans = right.searchLevelAcc(n, level + 1);
                       }
                   }
                   break;
           }

       }
         return ans;
    }

    public int depth(){
        int count =0;

        switch (type){
            case LEAF:
                count = 0;
                break;
            case BRANCH:
               int depthLeft, depthRight;
               depthLeft = left!=null? left.depth():0;
               depthRight = right!=null? right.depth():0;
               count = 1 + Math.max(depthLeft, depthRight);
               break;
        }
        return count;
    }

    public int width(){
        int count =0;

        switch (type){
            case LEAF:
                count = 1;
                break;
            case BRANCH:
               count += left!=null? left.width():0;
                count += right!=null? right.width():0;
               break;
        }
        return count;
    }


    @Override
    public String print () {
        return "\ninOrder: \n" + printInOrder();
    }

    public String printInOrder() {
        String out = "";

        switch (type) {
            case LEAF:
                out += value.toString() + "l ";
                break; // Add this break statement
            case BRANCH:
                out += left != null ? left.printInOrder() : "";
                out += value.toString() + "b ";
                out += right != null ? right.printInOrder() : "";
        }

        return out;
    }

    @Override
    public int branchNumber(){
        return returnBranchNumber();
    }

    private int returnBranchNumber(){
        int branchNumber = 0;
        switch (type) {
            case LEAF:
                branchNumber = 0;
                break;
            case BRANCH:
                branchNumber = 1;
                if(left != null){
                    branchNumber += left.branchNumber();
                }
                if(right != null){
                    branchNumber += right.branchNumber();
                }
                break;
        }
        return branchNumber;
    }

    public BSTNode getParentNode(Comparable n){
        //Method that returns the parent node of a node with value n
        BSTNode parentNode = null;
        if(value.equals(n)){
            parentNode = null;
        }else{
            switch (type) {
                case LEAF:
                    parentNode = null;
                    break;
                case BRANCH:
                    int compValue = value.compareTo(n);
                    if (compValue >= 0) {
                        if(left != null){
                            if(left.getValue().equals(n)){
                                parentNode = this;
                            }else{
                                parentNode = left.getParentNode(n);
                            }
                        }
                    } else {
                        if(right != null){
                            if(right.getValue().equals(n)){
                                parentNode = this;
                            }else{
                                parentNode = right.getParentNode(n);
                            }
                        }
                    }
                    break;
            }

        }
        return parentNode;
    }

    public BSTNode commonAncestor(Comparable one, Comparable two){
        //Method that returns the common ancestor of two nodes
        BSTNode commonAncestor = null;
        if(value.equals(one) || value.equals(two)){
            commonAncestor = this;
        }else{
            switch (type) {
                case LEAF:
                    commonAncestor = null;
                    break;
                case BRANCH:
                    int compValueOne = value.compareTo(one);
                    int compValueTwo = value.compareTo(two);
                    if (compValueOne >= 0 && compValueTwo >= 0) {
                        if(left != null){
                            commonAncestor = left.commonAncestor(one, two);
                        }
                    } else if(compValueOne < 0 && compValueTwo < 0){
                        if(right != null){
                            commonAncestor = right.commonAncestor(one, two);
                        }
                    }else{
                        commonAncestor = this;
                    }
                    break;
            }

        }
        return commonAncestor;
    }

    public BSTNode successor(Comparable n){
        BSTNode successor = null;
        if(value.equals(n)){
            successor = this;
        }else{
            switch (type) {
                case LEAF:
                    successor = null;
                    break;
                case BRANCH:
                    int compValue = value.compareTo(n);
                    if (compValue >= 0) {
                        if(left != null){
                            successor = left.successor(n);
                        }
                    } else {
                        if(right != null){
                            successor = right.successor(n);
                        }
                    }
                    break;
            }

        }
        return successor;
    }

    public BSTNode predecessor(Comparable n){
        BSTNode predecessor = null;
        if(value.equals(n)){
            predecessor = this;
        }else{
            switch (type) {
                case LEAF:
                    predecessor = null;
                    break;
                case BRANCH:
                    int compValue = value.compareTo(n);
                    if (compValue >= 0) {
                        if(left != null){
                            predecessor = left.predecessor(n);
                        }
                    } else {
                        if(right != null){
                            predecessor = right.predecessor(n);
                        }
                    }
                    break;
            }

        }
        return predecessor;
    }

    public boolean isLeaf(){
        return type == NodeType.LEAF;
    }

    public void deleteChild(BSTNode z){
       if(left != null && left.equals(z)){
           z.setParent(null);
           left = null;
       }
       if(right != null && right.equals(z)){
              z.setParent(null);
              right = null;
       }
    }

    /**
     * Aux method that replaces a node with its child
     * @param z node that only has one child
     */

    public void replaceChild(BSTNode z){
        //find the replacement of z
        // the replacement is the child of z (not null)
        BSTNode replacement = z.getLeft()!=null? z.getLeft():z.getRight();

        //update the parent of the replacement
        replacement.setParent(this);

        //search subtree, left or right to do the replacement
        //compare the content of z with the content of the current node
        if(value.compareTo(z.getValue())>0){ //to the left
          left = replacement;

        }else{ //to the right
            right = replacement;

        }

        z = null; //delete z

    }

}

