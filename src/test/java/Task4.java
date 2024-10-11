import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much USD do you want to exchange: ");
        double USD = scanner.nextDouble();
        double EUR;
        double rate = 1.5d;
        double fee = 2d;
        if(USD >0){
            EUR = USD*rate*(1-(fee/100));
            System.out.println("rate = 1.5, fee = 2% you will receive " + EUR + " EURO");
        }else {
            System.out.println("Please enter amount more than zero");
        }

    }
    }
    // try catch-ს რომ გავივლით. სხვა სიმბოლოებზე მერე ჩავკეტავ
