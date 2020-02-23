package arrays;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int[] tab = new int[6];
printArray(tab);


    }

    public static void printArray(int[] Array){

        Scanner scn = new Scanner(System.in);
        for(int i=0;i<Array.length;i++) {
            System.out.println("podaj cyfrę: ");
            Array[i] = scn.nextInt();
        }

        System.out.print("{ ");
        for(int i=0;i<Array.length;i++){
            System.out.print(i);
        if(i<Array.length-1)
            System.out.print(" ,");
        }
        System.out.print(" }");
    }

}
