package in_class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoIOComparison {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String name = input.nextLine();
        System.out.println("Welcome " + name + "." + "Please choose one of the security questions by entering 1 or 2");
        int verify_num = input.nextInt();
        if (verify_num = 1) {
            System.out.println("How much is  a bakers dozen?");
            int donuts = input.nextInt();
            if (donuts < 13){
                System.out.println("Wrong. Terminating system");
            }

            }
        }
    }