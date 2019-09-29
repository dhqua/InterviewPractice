package com.quaisms;

public class BinSearchTree {

    Node root;

    public class Node
    {
        int num;
        Node left;
        Node right;

        public Node(int data)
        {
            num =data;
            left = null;
            right = null;
        }
    }

    public BinSearchTree()
    {
        root = null;
    }

    public void insert(int data)
    {
        insertRec(root,data);
    }

    private void insertRec(Node rootNode, int data)
    {
        if(rootNode == null)
        {
            rootNode = new Node(data);
            return;
        }

        if(data <= rootNode.num )
        {
            insertRec(rootNode.left, data);
        }
        if(data >= rootNode.num)
        {
            insertRec(rootNode.right, data);
        }

    }

    public Node search(int data)
    {
       return searchRec(root, data);
    }

    private Node searchRec(Node rootNode, int data)
    {
        if(rootNode  == null) { return rootNode;}

        if(rootNode.num == data)
        {
            return rootNode;
        }
        if(data < rootNode.num)
        {
            searchRec(rootNode.left, data);
        }
        if(data > rootNode.num)
        {
            searchRec(rootNode.right, data);
        }

        return null;
    }

}
