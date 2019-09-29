package com.quaisms;

public class LinkedList {

    Node head;

    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void append(int data)
    {
        Node cursor = head;
        while(cursor.next != null) { cursor = cursor.next; }

        cursor.next = new Node(data);
    }

    public void remove(int data)
    {
        if( head == null)
            return;
        Node cursor = head;
        while(cursor.next != null)
        {
            if(cursor.next.num == data)
            {
                cursor.next = cursor.next.next;
                return;
            }
            cursor = cursor.next;
        }

    }

    public void printList()
    {
       Node cursor = head;
       if(cursor == null)
       {
           System.out.println("The list is empty!");
       }

      while(cursor != null )
      {
          if(cursor.next == null)
          {
              System.out.print(cursor.num);
          }else
          {
              System.out.print(cursor.num + ", ");
          }

          cursor = cursor.next;
      }
    }
}
