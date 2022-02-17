import java.util.Scanner;

public class lab01_3 {
  public static void main(String[] args) {
    int sum = 0;
    
    int number_sep;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000 :");

    int number = sc.nextInt();
    
if(number>=0 && number<=1000){
    while (number > 0) {

      number_sep = number % 10;

      sum += number_sep;

      number /= 10;

    }

    System.out.print("The sum of the digit is" + sum);
  }
  else  
  System.out.print("Error");
}
  }

