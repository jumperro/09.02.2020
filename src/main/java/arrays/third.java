package tablice;

import java.lang.reflect.Array;

public class third {
    public static void main(String[] args) {
        int array[]={13,22,45,54,68,31,47};
        System.out.println(contains(array,31));
    }


    public static boolean contains(int[] array, int key){
        for(int n:array) {
            if (n == key)
                return true;
        }
        return false;

    }
}
