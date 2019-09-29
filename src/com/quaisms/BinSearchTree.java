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

    public void deleteNode(int data)
    {
        deleteNodeRec(root, data);
    }

    private Node deleteNodeRec(Node tempRoot, int data)
    {
        if(tempRoot == null)
            return tempRoot;

        if(data < tempRoot.num)
        {
            tempRoot.left = deleteNodeRec(tempRoot.left, data);
        }
        else if(data > tempRoot.num)
        {
            tempRoot.right = deleteNodeRec(tempRoot.right, data);
        }
        else
        {
            // Case 1 - no children
            if(tempRoot.left == null)
            {
                return null;
            }else if (tempRoot.right == null) // One child
            {
               return tempRoot.left;
            }

            //Case 2 kids = replace the current node with the min value of the right subtree
            tempRoot.num = minSubTree(tempRoot.right);

            tempRoot.right = deleteNodeRec(tempRoot.right, tempRoot.num);
        }

        return tempRoot;
    }

    private int minSubTree(Node tempRoot)
    {
        int min = tempRoot.num;
        Node cursor = tempRoot;
        while(cursor.left != null)
        {
            min = cursor.num;
            cursor = cursor.left;
        }

        return min;
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
