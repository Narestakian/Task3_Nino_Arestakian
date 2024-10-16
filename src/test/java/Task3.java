import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter number: ");
    int number = scaner.nextInt();
    for ( int i = 1; i <= 10; i++){
            System.out.println(number + " x "  + i +  " = "  + (number * i));
    }
}
}