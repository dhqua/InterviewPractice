package com.quaisms;

import java.util.Random;

public class SearchSortLib {

    public SearchSortLib(){

    }
    public static int[] generateArray(int length)
    {
        Random r = new Random();

        int[] result = new int[length];
        for(int i =0; i < length; i++)
        {
            result[i] = (int) (r.nextFloat() *100);
        }

        return result;
    }
}
