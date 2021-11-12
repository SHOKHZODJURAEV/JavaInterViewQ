package FindUniqueElement;

import java.util.Arrays;
import java.util.Collections;

public class Solution3 {

    public static void main(String[] args) {


        String str1 = "AAABBBCDDDDEEEDGGGH";

        String result = "";

        for (String each:str1.split("")) {
            result += ((Collections.frequency(Arrays.asList(str1.split("")),each))==1)?each:"";

        }
        System.out.println("result = " + result);


    }
}
