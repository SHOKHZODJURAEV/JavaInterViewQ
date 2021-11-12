package RemoveDublicates;

public class Solution1 {

    /*
    Write a return method that can remove the dublicated values from String
    Ex: removeDub("AAABBBCCC") ==> ABC


     */

    public static void main(String[] args) {

        String str1 = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < str1.length(); i++) {

            if(!result.contains(""+str1.charAt(i))){

                result+= str1.charAt(i);

            }

        }

        System.out.println(result);



    }


}
