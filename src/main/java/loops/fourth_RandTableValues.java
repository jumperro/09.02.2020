package loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class fourth_RandTableValues {
    public static void main(String[] args) {
        fourth_RandTableValues o = new fourth_RandTableValues();
        System.out.println(Arrays.toString(o.RandTableValues()));
    }
    public int[] RandTableValues(){
        Scanner scn = new Scanner(System.in);
        System.out.println(" How many elements do you want to add to array");
        int[] arr=new int[scn.nextInt()];
        Random r = new Random();
        for (int e=0;e<arr.length;e++)
            arr[e]=(int)(r.nextInt(10)-1);

        return arr;
    }
}
