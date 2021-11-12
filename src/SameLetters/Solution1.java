package SameLetters;

import java.util.Arrays;

public class Solution1 {

/*

Write a return method that check if a string is
build out of the same letters as another string.

Ex: same("abc", ""cab");-> true;
same ("abc", "abb"); -> false;


 */
public static void main(String[] args) {

    String str1 = "good";
    String str2 = "doog";


    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();

   Arrays.sort(ch1);
   Arrays.sort(ch2);

    String result1 = "";
    String result2 = "";

    for(char each1 : ch1){
        result1 += each1;
    }
    for (char each2: ch2) {

        result2 += each2;

    }

    boolean theLastResult = result1.equals(result2);

    System.out.println(theLastResult);



}
    



}
