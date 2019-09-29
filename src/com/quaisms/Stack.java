package com.quaisms;

public class Stack {
    private Node top;
    private int size=0;

    public class Node{
       int data;
       Node next;

       public Node(int data)
       {
           this.data = data;
           next = null;
       }
    }

   public int top()
   {
       return top.data;
   }
   public boolean isEmpty()
   {
       return size == 0;
   }
   public int size()
   {
       return size;
   }

   public int pop() throws Exception {
       if(isEmpty())
           throw new Exception("Stack Empty");

       int temp = top.data;
       top = top.next;
       size--;
       return temp;
   }

   public void push(int data)
   {
       size++;
       if(top == null)
       {
           top = new Node(data);
           return;
       }

       Node temp = new Node(data);
       temp.next =top;
       top = temp;
   }
}
