import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for r (must be > 0): ");
        double r = scanner.nextFloat();
        System.out.print("Enter value for h (must be > 0): ");
        double h = scanner.nextFloat();
        System.out.print("Enter value for s (must be >= 0): ");
        double s = scanner.nextFloat();
        double SurfaceArea;
        double Volume;
        if (r <= 0 || h <= 0 || s < 0){
            System.out.println("Invalid input. Ensure that r > 0, h > 0, and s >= 0.");
        }
        else {
            SurfaceArea = Math.PI*r*(r + s);
            System.out.println("Surface Area is: " + SurfaceArea);
            Volume = Math.PI*Math.pow(r, 2)*h/3;
            System.out.println("Volume is: " + Volume);


        }
    }
}