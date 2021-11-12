package FrequencyCharacter;

public class StringSolution3 {

    public static void main(String[] args) {

     String value = "AAABBBCCCDDD";
     String result = "";
     int num = 0;

     while(num < value.length()){

         int count = 0;
         for (int i = 0; i < value.length(); i++) {
             if(value.charAt(i) == value.charAt(num)){

                 count++;
             }
         }
         result += value.charAt(num)+""+count;
         value = value.replace(""+value.charAt(num), "");


     }

        System.out.println("result = " + result);


    }

}
