package FrequencyCharacter;

public class StringSolution2 {

    public static void main(String[] args) {


        String value = "AAABBBCCCDDD";
        String nonDub = "";
        String result = "";

        for (int i = 0; i < value.length(); i++) {

            if (!nonDub.contains("" + value.charAt(i))) {
                nonDub += value.charAt(i);
            }
        }

        for (int i = 0; i < nonDub.length(); i++) {

            int count = 0;

            for (int j = 0; j < value.length(); j++) {

                if(nonDub.charAt(i) == value.charAt(j)){

                    count++;
                }

            }

            result += nonDub.charAt(i)+ ""+count;
        }

        System.out.println("result = " + result);


    }
}