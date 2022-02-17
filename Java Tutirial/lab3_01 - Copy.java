public class lab3_01 {
 
    public static void main(String[] args) {

     final int NUMBER_Printed = 100;

     int number_Print = 0, testedNumber = 2;
    
     while (number_Print < NUMBER_Printed) {

      if (isPrime(testedNumber) && isPalindrome(testedNumber)) {

       number_Print++;

       System.out.print(testedNumber + " ");

       if (number_Print % 10 == 0) {

        System.out.println();

       }

      }

      testedNumber++;

     }
    
    }
    
    /** Check whether number is prime */
    public static boolean isPrime(int number) {

     for (int divisor = 2; divisor <= number / 2; divisor++) {

      if (number % divisor == 0) { 

       return false; // number is not a prime

      }

     }
     
     return true; // number is prime

    }
    
    public static int reverse(int number) {

     int reverse_number = 0;

     int digit;
    
     while(number !=0){

    digit = number % 10;

   reverse_number = reverse_number * 10 + digit;

   number /= 10;

     }
    
     return reverse_number;

    }
    
    public static boolean isPalindrome(int number) {
    
     return number == reverse(number);
    
    }
    
   }