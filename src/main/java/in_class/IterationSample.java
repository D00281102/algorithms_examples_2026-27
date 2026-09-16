package in_class;


import java.util.Scanner;

public class IterationSample {
    static void main(){
        Scanner input = new Scanner(System.in);
        int target = 25;
        int guess = -1;
        while(guess != target){
            System.out.println("Guess a number between 1 and 30");
            guess = input.nextInt();

            if(guess == target){
                System.out.println("Well done, its correct");
            }else{
                System.out.println("Try again");
            }
        }
        System.out.println("Youve been released from guesseing hell");
    }
}
