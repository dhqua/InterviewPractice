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
        if(root == null)
        {
            root = new Node(data);
            return;
        }

        insertRec(root,data);
    }

    private Node insertRec(Node rootNode, int data)
    {
        if(rootNode == null)
        {
            rootNode = new Node(data);
            return rootNode;
        }

        if(data < rootNode.num )
        {
            rootNode.left = insertRec(rootNode.left, data);
        }
        if(data > rootNode.num)
        {
            rootNode.right = insertRec(rootNode.right, data);
        }

        return rootNode;

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

    public void printInOrder()
    {
        printInOrderRec(root);
    }

    private void printInOrderRec(Node temp)
    {
        Node tempNode = temp;
        if(tempNode == null)
        {
            return;
        }
        printInOrderRec(tempNode.left);
        System.out.print(tempNode.num + ", ");
        printInOrderRec(tempNode.right);
    }


    public void printPreOrder()
    {
        printPreOrderRec(root);
    }

    private void printPreOrderRec(Node temp)
    {
        Node tempNode = temp;
        if(tempNode == null)
        {
            return;
        }

        System.out.print(tempNode.num + ", ");
        printPreOrderRec(tempNode.left);
        printPreOrderRec(tempNode.right);
    }



    public void printPostOrder()
    {
        printPostOrderRec(root);
    }

    private void printPostOrderRec(Node temp)
    {
        Node tempNode = temp;
        if(tempNode == null)
        {
            return;
        }
        printPostOrderRec(tempNode.left);
        printPostOrderRec(tempNode.right);
        System.out.print(tempNode.num + ", ");
    }
}
