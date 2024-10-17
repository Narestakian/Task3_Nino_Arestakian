import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        int number = scaner.nextInt();
        int sum = 0;
        int i = 2;
        if (number>0){
            while(i<=number){
                sum +=i;
                i+=2;
            }
            System.out.println("Summery of even numbers is: "+sum);
        }
        else{
            System.out.println("Enter only positive number");
        }
    }
}