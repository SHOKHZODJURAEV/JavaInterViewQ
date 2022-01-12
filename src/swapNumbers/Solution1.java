package swapNumbers;

public class Solution1 {


    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        num1 = num1 + num2; // 300
        num2 = num1 - num2; // 100
        num1 = num1 - num2; // 200

        System.out.println(num1);
        System.out.println(num2);


    }

}
