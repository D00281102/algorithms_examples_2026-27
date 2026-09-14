package in_class;

import java.sql.SQLOutput;
import java.util.Scanner;

    public class DemoIO {
        static void main() {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your name: ");

            String name = input.nextLine();
            System.out.println("Hello there, " + name);

            if (name.equals("Fred")) {
                System.out.println("Youre banned Fred");
            } else {


                System.out.println("Please enter your age: ");
                int age = input.nextInt();

                if (age < 18) {
                    System.out.println("Youre too young to access");
                } else {
                    System.out.println("Welcome " + name +" " + age + ". " + "Welcome in!");
                }
            }
        }
    }
