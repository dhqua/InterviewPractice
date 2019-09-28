package com.quaisms;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node linkedList = new Node(0);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        Node cursor = linkedList;
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
