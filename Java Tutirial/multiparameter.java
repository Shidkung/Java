import java.util.Scanner;
public class multiparameter {
    static int plusMethod(int x,int y){

        return x+ y ;
    }
    static double plusMethod(double x,double y){

        return x+ y ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c =sc.nextDouble();
        double d = sc.nextDouble();
        int myNum1 = plusMethod(a, b);
        double myNum2 = plusMethod(c,d);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
