package ArrayListRemoveDublicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution1 {

/*
ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric",
 "Ahmed"..... Write a java operation to remove
 all the names named Ahmed

 */

    public static void main(String[] args) {



        List<String> ListNames = new ArrayList<>(Arrays.asList("ahmed", "John","AhMed", "Eric", "AhmeD"));

        Iterator<String> it = ListNames.iterator();
        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("Ahmed"))
                it.remove();
        }

        System.out.println("ListNames = " + ListNames);

    }


    
    
    
    
    
}
