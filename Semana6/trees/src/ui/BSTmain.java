package src.ui;
import src.model.BST;
import src.model.Student;

import java.util.Scanner;

/**
 * Seguimiento 5 9/1/2023
 * Mariana Agudelo Salazar A00398722
 */

public class BSTmain {
    private BST tree;
    private Scanner sc;

    public BSTmain() {
        tree = new BST();
        sc = new Scanner(System.in);
    }


    public static void main(String[] a) {

        Student m = new Student(1,"a","a");
        Student b = new Student(2,"b","b");
        Student c = new Student(3,"c","c");
        Student d = new Student(3,"d","d");

        System.out.println("m is less than b (expected -1) " + m.compareTo(b));
        System.out.println("b is less than c (expected -1) " + b.compareTo(c));
        System.out.println("c is grater than  m (expected 1) " + c.compareTo(m));
        System.out.println("c is equal to d (expected 0) " + c.compareTo(d));

        BST students = new BST();
        students.add(m);
        students.add(b);
        students.add(c);
        students.add(d);

        System.out.println(students.print());

        // creating an object of the class
        BSTmain obPpal = new BSTmain();
        // variable to store the option chosen by the user
        int option= 0;

        //loop to show the menu until the user
        // exit option is 0
        do {
            option =obPpal.menu();
            obPpal.answerOption(option);
        }while (option !=0);



    }

    public int menu() {


        int input;
        System.out.println("\n=============" +
                "\nSEGUIMIENTO 5 " +
                "\n===============" +
                "\n1. Array to tree (PLEASE SELECT THIS FIRST) \n" +
                "2. Find the depth\n" +
                "3. Find the successor \n" +
                "4. Find the Predecessor\n" +
                "5. Find the depth of the tree \n" +
                "6. Find the width of the tree\n" +
                "7. Find the number of branches\n" +
                "8. Find the parent of a node\n" +
                "9. Find the common ancestor of two different nodes\n" +
                "0. EXIT.\n");
        input = sc.nextInt();
        sc.nextLine();
        return input;
    }

    public void answerOption(int userOption) {
        switch(userOption) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                addArrayValues();
                System.out.println(tree.print());
                break;
            case 2:
                findDepth();
                break;

            case 3:
                findSuccessor();
                break;

            case 4:
                findPredecessor();
                break;

            case 5:
                findTreeDepth();
                break;

            case 6:
                findLeaves();
                break;

            case 7:
                findBranches();
                break;

            case 8:
                getParentNode();
                break;

            case 9:
                commonAncestor();
                break;

        }

    }

    /*
                  6
                /   \
             3          9
            / \         / \
           1   5       8  11
          /\   /     /\    \
          0 2  4     7 10   12


     */

    public void addArrayValues(){
        int values[]  = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        tree.add(values[6]);
        tree.add(values[3]);
        tree.add(values[9]);
        tree.add(values[1]);
        tree.add(values[5]);
        tree.add(values[8]);
        tree.add(values[11]);
        tree.add(values[2]);
        tree.add(values[0]);
        tree.add(values[7]);
        tree.add(values[10]);
        tree.add(values[12]);
        tree.add(values[4]);
        System.out.println("The nodes were added successfully.");

    }

    public void findDepth(){
        System.out.println("Type the value of the node: ");
        int n= sc.nextInt();
        int depth = tree.findDepthNode(n);
        System.out.println("The depth of the node is: " + depth);

    }

    public void findSuccessor(){
        System.out.println("Type the value of the node: ");
        int n= sc.nextInt();
        String successor = tree.findSuccessor(n).toString();
        System.out.println("The successor of the node is: " + successor);
    }

    public void findPredecessor(){
        System.out.println("Type the value of the node: ");
        int n= sc.nextInt();
        String predecessor = tree.findPredecessor(n).toString();
        System.out.println("The precessor of the node is: " + predecessor);
    }

    public void findTreeDepth(){
        int depth = tree.findDepthTree();
        System.out.println("The depth of the tree is: " + depth);
    }

    public void findLeaves(){
        int leaves = tree.findLeaves();
        System.out.println("The number of leaves of the tree is: " + leaves);
    }

    public void findBranches(){
        int branches = tree.branchNumber();
        System.out.println("The number of branches of the tree is: " + branches);
    }

    public void getParentNode(){
        System.out.println("Type the value of the node: ");
        int n=sc.nextInt();
        String parentNode = tree.getParentNode(n).toString();
        System.out.println("The parent node of the node is: " + parentNode);
    }

    public void commonAncestor(){
        System.out.println("Type the value of the first node: ");
        int n1=sc.nextInt();
        System.out.println("Type the value of the second node: ");
        int n2=sc.nextInt();
        String commonAncestor = tree.commonAncestor(n1,n2).toString();
        System.out.println("The common ancestor of the nodes is: " + commonAncestor);
    }


}
