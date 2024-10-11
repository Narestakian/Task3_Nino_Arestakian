import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter 5 Score and their Weights");
        // 1
        System.out.println("Enter first  score : ");
        double firstScore = scanner.nextDouble();
        System.out.println("Enter first Score weight : ");
        double firstWeight = scanner.nextDouble();
        double firstAvg =firstScore * firstWeight;
        //2
        System.out.println("Enter second score : ");
        double secondScore = scanner.nextDouble();
        System.out.println("Enter second Score weight : ");
        double secondWeight = scanner.nextDouble();
        double secondAvg =secondScore * secondWeight;
        //3
        System.out.println("Enter third score: ");
        double thirdScore = scanner.nextDouble();
        System.out.println("Enter third Score weight : ");
        double thirdWeight = scanner.nextDouble();
        double thirdAvg =thirdScore * thirdWeight;
        //4
        System.out.println("Enter fourth score: ");
        double fourthScore = scanner.nextDouble();
        System.out.println("Enter fourth Score weight : ");
        double fourthWeight = scanner.nextDouble();
        double fourthAvg = fourthScore * fourthWeight;
        //5
        System.out.println("Enter fifth score: ");
        double fifthScore = scanner.nextDouble();
        System.out.println("Enter fifth Score weight : ");
        double fifthWeight = scanner.nextDouble();
        double fifthAvg =fifthScore * fifthWeight;

        double sumAvg = firstAvg+secondAvg+thirdAvg+fourthAvg+fifthAvg;
        double weightSum = firstWeight+secondWeight+thirdWeight+fourthWeight+fifthWeight;
        double Average;
        if (weightSum != 0){
            Average =  sumAvg / weightSum;
            System.out.println("Your Weighted Average is: " + Average);
        } else {
            System.out.println("Divide by zero is prohibited!");
        }
    }
}
