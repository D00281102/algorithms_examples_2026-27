package Conversion_Exercise;

import java.util.Scanner;

public class CalcMax {
    public static int getValidIntegers (String Prompt){
        Scanner input = new Scanner(System.in);
        int value = 0;

        boolean validInt = false;
        while (!validInt) {
            System.out.println("Please enter the 1st number");
            if (input.hasNextInt()) {
                System.out.println("Thank you for putting a number");
                value = input.nextInt();
                validInt = true;


            }else{
                System.out.println("Please enter a number not a letter");
                input.nextLine();
            }
        }
        return value;
    }
}
