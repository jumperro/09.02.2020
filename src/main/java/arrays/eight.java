package arrays;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        eight o = new eight();
        Scanner scn = new Scanner(System.in);
        int[] arr= new int[3];
        for(int i=0;i<arr.length;i++) {
            System.out.print("podaj cyfrę/liczbę ");
            arr[i] = scn.nextInt();
        }
        System.out.println("\n-------------------------------------\n" +
                "Poniżej wynik działania programu sprawdzającego " +
                "czy poprzedni element zwiększony o 1 oraz " +
                "następny zwiększony o 1 są równe elementowi środkowemu");
        if( o.checkArray(arr))
            System.out.println("prawda");
        else
            System.out.println("fałsz");


    }
    public  boolean checkArray(int [] arr){
        int i = 1;
        for(int e:arr)
            System.out.println(e);
            return arr[i-1]+1==arr[i] && arr[i+1]-1==arr[i];
    }
}
