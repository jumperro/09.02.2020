package loops;

import java.util.Arrays;
import java.util.Scanner;

public class fifth_Alphabet {
    public static void main(String[] args) {
        fifth_Alphabet o = new fifth_Alphabet();

        System.out.println(Arrays.toString(o.alphabetLetters()));

 }
    public char [] alphabetLetters(){
        char[] arr = new char[90-64];
        Scanner scn = new Scanner(System.in);
        System.out.println("Do you want show (c)apital or (n)on-capital letters? ");
        String a=scn.next();
        if ("c".equals(a)) {
            for (int i = 0, x = 65; i < arr.length; i++, x++) {
                arr[i] = (char) x;
            }
        } else if ("C".equals(a)) {
            for (int i = 0, x = 65; i < arr.length; i++, x++) {
                arr[i] = (char) x;
            }
        }
            if ("N".equals(a)) {
                for (int i = 0, x = 97; i < arr.length; i++, x++) {
                    arr[i] = (char) x;
                }
            }
                else if ("n".equals(a)) {
                    for (int i = 0, x = 97; i < arr.length; i++, x++) {
                        arr[i] = (char) x;
                    }
        }
        return arr;
    }
}
