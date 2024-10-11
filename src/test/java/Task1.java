import java.util.Scanner;
public class Task1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a (must be > 0): ");
        float a = scanner.nextFloat();
        System.out.print("Enter value for b (must be > 0): ");
        float b = scanner.nextFloat();
        System.out.print("Enter value for c (must be >= 0): ");
        float c = scanner.nextFloat();
        float x;
        if (a <= 0 || b <= 0 || c < 0){
            System.out.println("Invalid input. Ensure that a > 0, b > 0, and c >= 0.");
        }
        else {
            x = ((float) Math.pow(a, 3) + (float) Math.pow(b, 2) - (float)Math.sqrt(c))/(a * b + c);
            System.out.println(x);
        }
    }
}
