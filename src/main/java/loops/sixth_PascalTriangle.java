package loops;

import java.util.Arrays;
import java.util.Scanner;

public class sixth_PascalTriangle {
    public static void main(String[] args) {
        sixth_PascalTriangle o = new sixth_PascalTriangle();
        System.out.print(o.trójkąt_pascala());
    }
    public int trójkąt_pascala(){
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę rzędów");
        int rzedy = skaner.nextInt();
        // taka powinna być liczba kolumn, ponieważ dodajemy po jednej
        // pustej kolumnie po bokach, dzięki temu można będzie wyliczać
        // wartość kolejnej liczby dodając liczby z lewej i prawej leżące
        // w poprzedniej kolumnie
        int kolumny = rzedy * 2 +1;
        // tworzymy tablice, zera domyślie wypełniają puste miejsca,
        // ułatwi to wyliczenie kolejnych liczb
        int[][] tab = new int[rzedy][kolumny];
        int srodek = rzedy;
        // pierwszy rząd
        tab[0][srodek] = 1;
        for (int i = 1; i < rzedy; i++) {
            System.out.printf("\n\nPRZEBIEG\n\n");
            // liczby > 0 mieszczą się w tym zakresie
            for (int j = srodek-i; j <= srodek+i; j++) {
                // obliczamy wszystkie komórki w zakresie, ponieważ zera
                // oznaczają puste komórki wyliczane są zarówno puste
                // komórki (0 + 0) jak i skrajne jedynki (0 + 1),
                // nie musimy ich specjalnie wstawiać

                //               System.out.println();
                tab[i][j] = (tab[i-1][j-1])+(tab[i-1][j+1]);
                System.out.print("\npara\npierwsza: "+tab[i-1][j-1] +" - dla i równego: "+i);
                System.out.print(" \ndruga: "+tab[i-1][j+1]+" - j wynosi: "+j);

            }
        }

        // odkomentuj poniższy fragment, jeśli chcesz podejrzeć
        // wartości w tablicy

        for (int[] tab1 : tab) {
            System.out.println("\n"+Arrays.toString(tab1));
        }


        // drukowanie gwiazdek w miejscu liczb nieparzystych
        for (int[] tab1 : tab) {
            for (int l : tab1) {
                if(l!=0)
                    System.out.printf("%2d",l);
                else if(l==0)
                    System.out.print("x");
            }
            System.out.println("");
        }
        return rzedy;
    }

}