package FrequencyCharacter;

import java.util.Arrays;
import java.util.Collections;

public class StringSolution1 {

    public static void main(String[] args) {

     String value = "AAABBBCCCDDDD";
     String nonDub = "";
     String result = "";

        for (int i = 0; i < value.length(); i++) {

            if(!nonDub.contains(""+value.charAt(i))){

            nonDub += value.charAt(i);

        }
        }
        System.out.println("nonDub = " + nonDub);


        for (int i = 0; i < nonDub.length(); i++) {

            int num = Collections.frequency(Arrays.asList(value.split("")), ""+nonDub.charAt(i));
            result += ""+nonDub.charAt(i)+num;

        }

        System.out.println("result = " + result);


    }
}
