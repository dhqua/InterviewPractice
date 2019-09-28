package com.quaisms;

public class Node {
    Node next = null;
    int num;

    public Node(int data)
    {
        num = data;
    }

    public Node push(int data)
    {
       Node n = new Node(data);
       n.next = this;
       return n;
    }

    public void append(int data)
    {
        Node n = new Node(data);
        Node cursor = this;
        while(cursor.next != null) { cursor = cursor.next; }

        cursor.next = n;
    }

    public void printList()
    {

        Node cursor = this;
        while(cursor != null)
        {
            if(cursor.next == null)
            {
                System.out.print(cursor.num);
            }
            else
            {
                System.out.print(cursor.num + ", ");
            }
            cursor = cursor.next;
        }
    }

}
