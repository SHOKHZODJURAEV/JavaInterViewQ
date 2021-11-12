package InterviewQJava.StringReverse;

import java.util.ArrayList;
import java.util.Arrays;

public class StringReverse2 {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "C" };

        String[] result = new String[3];

        for (int i = arr.length-1, j = 0; i >= 0 ; i--, j++) {


            result[j] = arr[i];



        }
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));


    }

    }
