import java.util.Scanner;
public class lab2_01 {
    public static void main(String[] args) {
        Scanner is = new Scanner(System.in);

        System.out.print("Enter Today's day : ");

        int day = is.nextInt();

        System.out.print("Enter the number of days elapsed since today : ");

        int next_day = is.nextInt();
        
        String[] date = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"} ;
        
        System.out.print("Today is "+date[day]+" and the future day is "+date[(day+next_day)%7]);

    }
}
