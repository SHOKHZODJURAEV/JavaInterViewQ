package FindUniqueElement;

public class Solution1 {

    public static void main(String[] args) {

        String str = "AAAABCCCCDDDEEEEEEFLLLLO";

        String result = "";


        for (int i = 0; i < str.length(); i++) {

            int unique = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    unique++;
                }

            }
            if (unique == 1){
                result+= str.charAt(i);
            }
        }

        System.out.println(result);



    }
}
