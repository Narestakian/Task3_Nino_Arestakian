import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();
        System.out.print("Enter value for y: ");
        int y = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();
        if (operator.equals("+")) {
            System.out.println("Result: " + (x + y));
        } else if (operator.equals("-")) {
            System.out.println("Result: " + (x - y));
        } else if (operator.equals("*")) {
            System.out.println("Result: " + (x * y));
        } else if (operator.equals("/")) {
            if (x != 0 && y != 0) {
                System.out.println("Result: " + (x / y));
            } else {
                System.out.println("Error: Divide by zero is prohibited.");
            }
        } else {
            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
        }
        }
    }


