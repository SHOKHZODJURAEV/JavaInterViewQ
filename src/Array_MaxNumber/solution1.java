package Array_MaxNumber;

import java.util.Arrays;

public class solution1 {


    public static void main(String[] args) {


        int[] arrayNum = {55, 3, 5, 7, 11, 45};

        System.out.println("maxNumb(arrayNum) = " + maxNumb(arrayNum));


    }

    public static int maxNumb(int[] arrayNum) {

        int maxN = arrayNum[0];

        for (int i = 0; i < arrayNum.length; i++) {

            int eachNum = arrayNum[i]; // 3

            if (eachNum > maxN) { //3

                maxN = eachNum; //
            }
        }
        return maxN;
    }
}