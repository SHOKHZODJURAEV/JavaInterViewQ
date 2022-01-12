package EvenNumberOdd;

public class Solution1 {

    public static void main(String[] args) {

        int example = -1;
        System.out.println(identifyOddEven(example));

    }
    public static String identifyOddEven(int num) {

        if (num > 0){

            if(num % 2 == 0){
                return "Even number";
            }else{
                return "Odd number";
            }
            }else{
            return "Invalid Number";
        }
    }
}
