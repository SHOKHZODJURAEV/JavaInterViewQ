package InterviewQJava.StringReverse;

public class StringReverse1 {

    public static void main(String[] args) {


        String reverse = "ABCD";
        String result = "";

        for (int i = reverse.length()-1; i >= 0; i--) {

            result += reverse.toCharArray()[i];



        }
        System.out.println("result = " + result);

        



    }
}
