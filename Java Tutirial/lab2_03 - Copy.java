import java.util.Scanner;
public class lab2_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = (q+(26*(m+1)/10)+k/4+j/4+(5*j))%7;
        switch (h-1) {
        case 0:
        System.out.print("Sunday \n");
           
            break;
        case 1:
        System.out.print("Monday \n");
            break;
        case 2:
            
             System.out.print("Tuesday \n");
            break;
        case 3:
            
             System.out.print("Wednesday \n");
            break;
        case 4:
        
        System.out.print("Thursday \n");
            break;
        case 5:
        
        System.out.print("Friday \n");
            break;
        case 6:
        System.out.print("Saturday \n");
       
            break;
        }
        
    }
    
}
