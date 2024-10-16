import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = scaner.nextLine();
        String lowInput = input.toLowerCase();
        switch (lowInput){
            case "a": System.out.println(input + " is a vowel");
                break;
            case "e": System.out.println(input + " is a vowel");
                break;
            case "i": System.out.println(input + " is a vowel");
                break;
            case "o": System.out.println(input + " is a vowel");
                break;
            case "u": System.out.println(input + " is a vowel");
               break;
            default :
                System.out.println(input + " is a constant");
        }

    }
}



