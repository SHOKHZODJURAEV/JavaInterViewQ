package RemoveDublicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution2 {

    public static void main(String[] args) {


        String str1 = "AAABBBBCCCCDDDDEEEE";

        String str2 = new LinkedHashSet<String>(Arrays.asList(str1.split(""))).toString();
        String str3 = str2.replace(",","").replace
                ("[","").replace("]","");

        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);


    }
}
