package loops;

import java.util.Random;
import java.util.Scanner;

public class eight_nNaturalNumbeers {
    public static void main(String[] args) {
        eight_nNaturalNumbeers o = new eight_nNaturalNumbeers();
        o.nNaturalNo();

    }
    public void nNaturalNo (){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ile liczb naturalnych chcesz wyświetlić? ");
        int a=0;
        int b=scn.nextInt();
        Random r= new Random();
        while (a<b){
            System.out.print(r.nextInt(1000)+0);
            a++;
        }
    }
}
