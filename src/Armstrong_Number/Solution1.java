package Armstrong_Number;

public class Solution1 {

    public static void main(String[] args) {
     // 153
     // 370

        int n = 153;
        int temp = n;
        int r;
        int sum = 0;

        while (n>0){

            r = n%10;
            n = n/10;
            sum = sum + r*r*r;

        }

        if(temp == sum){
            System.out.println("It is an Armstrong number");
        }else{
            System.out.println("It is not Armstrong number");
        }
    }
}
