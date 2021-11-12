package SameLetters;

import java.util.*;

public class Solution2 {

    public static void main(String[] args) {


        String str1 = "good";
        String str2 = "bad";


        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

        boolean result = str1.equals(str2);

        System.out.println("result = " + result);


    }
}
