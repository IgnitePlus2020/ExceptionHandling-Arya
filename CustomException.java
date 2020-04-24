package com.tgt.igniteplus;
import java.util.HashSet;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class CustomException {
    static void validate(int zipcode) {
        HashSet<Integer> incorrectcode = new HashSet();
        incorrectcode.add(123);
        incorrectcode.add(456);
        incorrectcode.add(789);
        try{
            if(incorrectcode.contains(zipcode))throw new InvalidCodeException(String.format("Not yet delivering at " +zipcode));
               // System.out.println("sorry cant deliver to this place");
            else
                System.out.println("delivery avaliable to this area");
        }
        catch(InvalidCodeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter valid zipcode to check availability :");
        int zipcode = in.nextInt();
        validate(zipcode);
    }

}

/* output1
    enter valid zipcode to check availability :
    2344
    delivary avaliable to this area
  output2
  enter valid zipcode to check availability :
  123
  not yet delivering at this area 123
 */