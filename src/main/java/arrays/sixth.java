package arrays;

import java.util.Arrays;

public class sixth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("funkcja zwwracająca INT[]-  \n"+Arrays.toString(reverse(arr))+"\n\n funkcja zwracająca VOID");
        reverse1(arr);
    }

    public static int[] reverse(int[] array) {
        int j = array.length;
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
/*            System.out.println("i -"+i);
            System.out.println("j -"+j);*/
            tmp = array[i];
            array[i] = array[j - 1];
            array[j - 1] = tmp;
            j--;

        }
/*        for(int a:array)
            System.out.print(a);*/
        return array;

    }

    public static void reverse1(int[] array) {
        int j = array.length;
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
/*            System.out.println("i -"+i);
            System.out.println("j -"+j);*/
            tmp = array[i];
            array[i] = array[j - 1];
            array[j - 1] = tmp;
            j--;

        }
        System.out.print("{ ");
        for (int a : array)
            System.out.print(a+" ");
        System.out.print("}");
    }
}

