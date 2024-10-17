

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        while(true){
            Scanner scaner = new Scanner(System.in);
            System.out.println("Enter number: ");
            int number = scaner.nextInt();
            if (number>randomNumber){
                System.out.println("Your guess is high");
            }
            else if (number<randomNumber){
                System.out.println("Your guess is low");

            }
            else if (number == randomNumber){
                System.out.println("Your guess is correct!!! ");
                break;

            }
        }



    }
}
