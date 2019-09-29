package com.quaisms;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.append(0);

        System.out.print("Linked List: ");
        linkedList.printList();


        BinSearchTree binTree = new BinSearchTree();
        binTree.insert(7);
        binTree.insert(2);
        binTree.insert(9);
        binTree.insert(3);
        binTree.insert(8);
        binTree.insert(1);

        System.out.println("\nBinary Search Tree Traversals\n-----------------------");
        System.out.print("In Order: ");
        binTree.printInOrder();


        System.out.print("\nPre Order: ");
        binTree.printPreOrder();

        System.out.print("\nPost Order: ");
        binTree.printPostOrder();


    }
}
