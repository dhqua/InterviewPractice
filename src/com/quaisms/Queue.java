package com.quaisms;

public class Queue {
    private Node first, last;
    private int size =0;

    class Node{
        int data;
        Node next;

        protected Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int front()
    {
        if(!isEmpty())
            return first.data;
        return 0;
    }

    public int rear()
    {
        if(!isEmpty())
            return last.data;
        return 0;
    }

    public void enqueue(int data)
    {
        size++;
        if(first == null)
        {
            first = new Node(data);
            last = first;
            return;
        }

        last.next = new Node(data);
        last = last.next;
    }

    public int dequeue() throws Exception {
        if(isEmpty())
            throw new Exception("Empty Queue");

        int temp = first.data;
        first = first.next;
        size--;
        return temp;

    }
}
