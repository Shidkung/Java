import java.util.Scanner;
 
public class lab2_04 {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the first city:");

  String first_city = input.nextLine();

  System.out.print("Enter the second city:");

  String second_city = input.nextLine();

  System.out.print("Enter the third city:");

  String third_city = input.nextLine();

  String temp = "";
 
  if (first_city.compareTo(second_city) > 0) {

   temp = second_city;

   second_city = first_city;

   first_city = temp;
 
  }
  if (second_city.compareTo(third_city) > 0) {

   temp = third_city;

   third_city = second_city;

   second_city = temp;
 
  }
  if (first_city.compareTo(second_city) > 0) {

   temp = second_city;

   second_city = first_city;

   first_city = temp;
 
  }
  
  System.out.println("The three cities in alphabetical order are " + first_city + " " + second_city + " " + third_city);
 }
 
}