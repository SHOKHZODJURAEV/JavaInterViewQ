package Concate_two_arrays;

import java.util.Arrays;

public class Solution1 {
    /*
    1. Array -- Concatenate two arrays:
Write a return method that can concate two arrays.

     */


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};

        int[] arr2 = {6,7,8,9,10};


        System.out.println(Arrays.toString(merge(arr1,arr2)));




    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length]; // create capacity for array

        int j = 0; // index
        for (int each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (int each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


}
