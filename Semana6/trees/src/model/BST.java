package src.model;

public class BST implements Tree{

    private BSTNode root;
    private int size;

    public BST() {
        this.root = null;
    }

    @Override
   public void add(Comparable n){
         if (root == null){
              root = new BSTNode(n);
         }else{
              root.add(n);
         }
         size++;
   }

   @Override
   public Object search(Comparable n){
        Object found = null;
        if(root != null){
            found = root.search(n);
        }
        return found;
   }

    //Find the depth of a node in a tree
    public int findDepthNode(Comparable n) {
        int depth = -1; //Empty tree
        if (root != null) {
            depth = root.searchLevel(n);
        }
        return depth;
    }


    //Find the depth of a tree
    public int findDepthTree() {
        int depth = -1; //Empty tree
        if (root != null) {
            depth = root.depth();
        }
        return depth;
    }

    //Find width of a tree
    public int findLeaves() {
        int leaves = -1; //Empty tree
        if (root != null) {
            leaves = root.width();
        }
        return leaves;
    }


    //Find the successor of a node
    public Comparable findSuccessor(Comparable n) {
        Comparable successor = -1; //Empty tree
        if (root != null) {
            successor = root.successor(n).getValue();
        }
        return successor;
        /*
        BSTNode successorNode = findSuccessorNode(root, n, null);

        if (successorNode != null) {
            return successorNode.getValue();
        } else {
            return -1; //Successor not found
        }

         */
    }

    //Find the successor of a node
    /*
    private BSTNode findSuccessorNode(BSTNode node, int n, BSTNode successor) {
        if (node == null) {
            return successor;
        }

        if (n < node.getValue()) {
            // If the target value is less than the current node's value, update successor and search in the left subtree
            return findSuccessorNode(node.getLeft(), n, node);
        } else if (n > node.getValue()) {
            // If the target value is greater than the current node's value, search in the right subtree
            return findSuccessorNode(node.getRight(), n, successor);
        } else {
            // If the target value is equal to the current node's value, we have found the node, so we need to find its successor
            if (node.getRight() != null) {
                // If the node has a right subtree, the successor is the minimum value node in the right subtree
                return findMinValueNode(node.getRight());
            } else {
                // If the node does not have a right subtree, the successor is the ancestor where we last took a right turn
                return successor;
            }
        }
    }

    // Helper method to find the minimum value node in a subtree
    private BSTNode findMinValueNode(BSTNode node) {

        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

     */

    //Find the predecessor of a node
    public Comparable findPredecessor(Comparable n) {
        Comparable predecessor = -1; //Empty tree
        if (root != null) {
            predecessor = root.predecessor(n).getValue();
        }
        return predecessor;
        /*
        BSTNode predecessorNode = findPredecessorNode(root, n, null);

        if (predecessorNode != null) {
            return predecessorNode.getValue();
        } else {
            return -1; //Predecessor not found
        }

         */
    }

    /*
    //Find the predecessor of a node
    private BSTNode findPredecessorNode(BSTNode node, int value, BSTNode predecessor) {
        if (node == null) {
            return predecessor;
        }

        if (value < node.getValue()) {
            // If the target value is less than the current node's value, search in the left subtree
            return findPredecessorNode(node.getLeft(), value, predecessor);
        } else if (value > node.getValue()) {
            // If the target value is greater than the current node's value, update predecessor and search in the right subtree
            return findPredecessorNode(node.getRight(), value, node);
        } else {
            // If the target value is equal to the current node's value, we have found the node, so we need to find its predecessor
            if (node.getLeft() != null) {
                // If the node has a left subtree, the predecessor is the maximum value node in the left subtree
                return findMaxValueNode(node.getLeft());
            } else {
                // If the node does not have a left subtree, the predecessor is the ancestor where we last took a left turn
                return predecessor;
            }
        }
    }

    // Helper method to find the maximum value node in a subtree
    private BSTNode findMaxValueNode(BSTNode node) {

        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;
    }

     */

    public String print(){
        String out="";
        if(root == null)
            out="Empty tree";
        else
            out=root.print();
        return out;
    }

    @Override
    public int branchNumber() {
        int branchNumber;
        if(root == null)
            branchNumber = 0;
        else
            branchNumber = root.branchNumber();

        return branchNumber;
    }

    public Comparable getParentNode(Comparable n){
        //Method that returns the parent node of a node with value n
        int parentNode = 0;
        if(root != null){
            parentNode = (int) root.getParentNode(n).getValue();
        }
        return parentNode;
    }

    public Comparable commonAncestor(Comparable one, Comparable two){
        //Method that returns the common ancestor of two nodes
        Comparable commonAncestor = 0;
        if(root != null){
            commonAncestor = root.commonAncestor(one, two).getValue();
        }
        return commonAncestor;
    }

    public void delete(Comparable n){
        if(root != null){
            BSTNode z= (BSTNode) root.search(n);
            BSTNode zParent = (BSTNode) root.getParentNode(n);

            // case 1, node to delete is a leaf
            if(z.isLeaf()) {
                zParent.deleteChild(z);
                size--;
            }else if (z.getLeft() != null && z.getRight() != null){
                //find the succesor of z
                BSTNode y = z.successor(n);

                //case 3.1 y is right child of z
                if(z.getRight().equals(y)){
                    //replace z with y
                    zParent.replaceChild(y);
                    //replace the right child of z for x
                    BSTNode x = y.getRight();
                    //update the parent of x for z
                    x.setParent(z);
                    //delete y
                    y=null;
                }else{
                    //case 3.2 y is not right child of z
                    //replace the content of z for the content of y
                    z.setValue(y.getValue());
                    //replace y for its right subtree
                    y.getParent().replaceChild(y.getRight());
                    y=null;
                }
            }else {
                //case 2, z has one child
                zParent.replaceChild(z);
                size--;
            }
        }
    }

}
