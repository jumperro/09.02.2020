package loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class eleventh_nNaturalDoWhile {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scn = new Scanner(System.in);
        System.out.print("How many natural letters do you want to display ? ");
        int b=scn.nextInt();
int a=0;
        System.out.print("|");
do{
    System.out.printf("%4d|",r.nextInt(1000)-500);
    a++;
}while (a<b);
    }
}
