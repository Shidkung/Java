import java.util.Scanner;
import java.lang.Math;
public class lab2_02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("scissor(0),rock(1),paper(2) : ");

        int rockpaperscissor_number = in.nextInt();

        String[] rockpaperscissor = {"scissor","rock","paper"};

        int Computer = (int)(Math.random()*2);

        if( rockpaperscissor_number>=0 &&  rockpaperscissor_number<=2){
                if(rockpaperscissor_number == Computer){
                    System.out.print("The computer is "+rockpaperscissor[Computer]+". You are "+rockpaperscissor[rockpaperscissor_number]+" too . It is a draw");
                }
                else if((rockpaperscissor_number==0 && Computer == 1)||(rockpaperscissor_number==1 && Computer == 2)||(rockpaperscissor_number==2 && Computer == 0)){
                    System.out.print("The computer is "+rockpaperscissor[Computer]+". You are "+rockpaperscissor[rockpaperscissor_number]+" You loose");
                }
                else if((rockpaperscissor_number==0 && Computer == 2)||(rockpaperscissor_number==1 && Computer == 0)||(rockpaperscissor_number==2 && Computer == 1)){
                    System.out.print("The computer is "+rockpaperscissor[Computer]+". You are "+rockpaperscissor[rockpaperscissor_number]+" You won");
                }

        }
        else {
            System.out.print("Error");
        }







    }
}
