package DivideTwoNumberWithoutDivision;

public class Solution1 {

    /*
    4. Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but
for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers
which are a multiple of 5, print "RA" instead of the number.
for numbers which are a multiple of both 3 and 5, print "FINRA"
 instead of the number.

     */
    public static void main(String[] args) {

        divisibleFinra();
    }

    public static void divisibleFinra() {

        int num = 0;
        String result = "";

        while (num < 30) {
            num++;
            if (num % 3 == 0 && num % 5 == 0) {
                result = "FINRA";
            } else if (num % 3 == 0) {
                result = "FIN";
            } else if (num % 5 == 0) {
                result = "RA";
            } else {
                result = "" + num;
            }
            System.out.println(result);

        }


    }
}
