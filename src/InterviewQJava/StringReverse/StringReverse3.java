package InterviewQJava.StringReverse;

public class StringReverse3 {

    public static void main(String[] args) {

        String reverseStr = "ABCD";

        String result = new StringBuffer(reverseStr).reverse().toString();

        System.out.println("result = " + result);


    }
}
