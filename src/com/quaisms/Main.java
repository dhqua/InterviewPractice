package com.quaisms;

public class Main {

    public static void main(String[] args) throws Exception {
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


        binTree.deleteNode(2);
        System.out.print("\nAfter deleting: ");
        binTree.printInOrder();

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

       System.out.println("\n\nStack Tests\n-----------------") ;
       System.out.print("Top: " + stack.top());
       System.out.print("\nPopping Entire Stack: ");
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop() + ", ");

        }

        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("\n\nQueue Tests\n-----------------") ;
        System.out.print("Front: " + q.front());
        System.out.print("\nPopping Entire Queue: ");
        while(!q.isEmpty())
        {
            System.out.print(q.dequeue() + ", ");

        }
    }
}
