package Conversion_Exercise;

import java.util.Scanner;

public class q1_2 {
    static void main(){
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int total = 0;
        //int count = (num1);
        num1 = CalcMax.getValidIntegers("Please enter the value of your 1st number");
        num2 = CalcMax.getValidIntegers("PLease enter the value of the 2nd number");
        for (int count = num1; count <= num2; count++) {
            total = total + count;
        }
        System.out.println("Total: " + total);
    }
}
