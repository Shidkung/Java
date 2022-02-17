import java.util.Scanner;

public class lab01_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entter weight in pounds :");

        double weight = sc.nextDouble();

        System.out.print("Enter height in inchs :");

        double height = sc.nextDouble();

        // pounds to kilograms //
        weight *= 0.45359237;

        // inchs to meters //
        height *= 0.0254;

        double BMI = weight / (height * height);

        System.out.println(" BMI is " + BMI);

    }
}
