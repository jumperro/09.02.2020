package tablice;

import java.util.Arrays;
import java.util.Scanner;


public class dwa {
    public static void main(String[] args) {
        int[] tab = new int[6];
        System.out.println(printArray(tab));


    }

    public static String printArray(int[] Array){
        String f = "";
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<Array.length;i++) {
            System.out.println("podaj cyfrę: ");
            Array[i] = scn.nextInt();
        }


        for(int i=0;i<Array.length;i++){

            if(f.equals("")) {
                f += "{ ";
            }
            else if (!(f.equals("")))
            {
                if(i<Array.length-1)
                    f += Array[i] +", ";
                else
                f += Array[i];
            }

        }
       f += " }";
        return f;

    }

}

