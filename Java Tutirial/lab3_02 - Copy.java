import java.util.*;

public class lab3_02 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter list1: ");

        String[] string_list1 = input.nextLine().split(" ");

        int[] list1 = new int[string_list1.length];

        for (int i = 0; i < string_list1.length; i++) {

            list1[i] = Integer.parseInt(string_list1[i]);

        }

        System.out.print("Enter list2: ");

        String[] string_list2 = input.nextLine().split(" ");

        int[] list2 = new int[string_list2.length];

        for (int i = 0; i < string_list2.length; i++) {

            list2[i] = Integer.parseInt(string_list2[i]);

        }
        int[] list3 =  merge(list1,list2);

        System.out.print("The merged list is ");

        for(int i = 0; i < list3.length;i++){

            System.out.print(list3[i]+" ");

        }

    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] mergeint = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {

            mergeint[i] = list1[i];

        }

        for (int i = 0; i < list2.length; i++) {

            mergeint[i + list1.length] = list2[i];

        }
        Arrays.sort(mergeint);

        return mergeint;

    }
    
}