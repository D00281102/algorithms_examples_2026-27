package Conversion_Exercise;

import java.util.Scanner;

public class q1_1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;

        int value = 0;
        while (value != -1) {
            System.out.println("Please enter a anumber or (-1) to teminate");
            value = input.nextInt();

            if (value != -1) {
                total += value;
                count++;
            }
        }
        int average = total / count;
        System.out.println("Sum: " + total + "Average: " + average);
    }
}