package Array_MinNumber;

public class Solution1 {

    public static void main(String[] args) {


        int[]arrayNum = {33,21,45,15,65};

        System.out.println("arrayNumb(arrayNum) = " + arrayNumb(arrayNum));

    }

    public static int arrayNumb(int[] arrayNum){


        int minNumber = arrayNum[0];

        for (int i = 0; i < arrayNum.length; i++) {


            int eachNumber = arrayNum[i];

               if(eachNumber <  minNumber){

                   minNumber = eachNumber;
               }
        }

        return minNumber;
    }





}
