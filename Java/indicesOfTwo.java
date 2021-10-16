package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class indicesOfTwo {
    public int[] sumTwo(int[] nums_arr, int target) throws IllegalAccessException {
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>(    );

        for (int i = 0; i < nums_arr.length; i++) {
            int comp = target - nums_arr[i];
            if (hm.containsKey(comp)) {
                return new int[] {hm.get(comp), i};
            }
            hm.put(nums_arr[i],i);
        }
        throw new IllegalAccessException("Not Found");
    }


    public static void main(String[] args) throws IllegalAccessException {
        int myarr[] = {2, 7,11,15};
        indicesOfTwo ts = new indicesOfTwo();
        System.out.println(Arrays.toString(ts.sumTwo(myarr, 26)));
    }
}