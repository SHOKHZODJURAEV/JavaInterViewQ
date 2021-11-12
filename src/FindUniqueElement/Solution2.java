package FindUniqueElement;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {

        String str = "AAABBBCDDEFGHHH";


        String[] arra = str.split("");

       String result = "";
        for (int i = 0; i < arra.length; i++) {

            int num = 0;

            for (int j = 0; j < arra.length; j++) {

                if(arra[i].equalsIgnoreCase(arra[j]))
                num++;


            }
            if(num == 1){
                result+= arra[i];
            }
        }

        System.out.println("result = " + result);


    }
}
