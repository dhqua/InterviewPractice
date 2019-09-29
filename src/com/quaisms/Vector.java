package com.quaisms;

public class Vector {
    int capacity = 16;
    int size =0;
    int[] vec;

    public Vector()
    {
         vec = new int[capacity];
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void append(int x)
    {
        if(size >= capacity)
        {
            capacity *= 2;
            int[] temp = new int[capacity];
            temp = vec.clone();
            vec = temp;
        }
        vec[size] = x;
        size++;
    }

    public void insert(int index, int val)
    {
        if(index >= capacity)
        {
            capacity *= 2;
            int[] temp = new int[capacity];
            for(int i =0; i < vec.length; i++)
            {
                temp[i] = vec[i];
            }
            vec = temp;
        }
        vec[index] = val;
        size++;
    }

    public int contains(int data)
    {
        for(int i =0; i < vec.length; i++)
        {
            if(vec[i] == data)
                return i;
        }
        return -1;
    }

    public void clear()
    {
        size =0;
        for(int i =0; i < vec.length; i++)
        {
            vec[i] = 0;
        }
    }

    public void printVec()
    {
        for(int num : vec)
        {
            System.out.print(num + ", ");
        }
    }

}
