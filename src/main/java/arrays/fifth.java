package arrays;

import java.util.Arrays;

public class fifth {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int [] y = copyArray(arr);

//        y=arr.clone();
//for (int e:y)
        System.out.print(Arrays.toString(y) +" ");
    }
    public static int[] copyArray (int[] array) {
        int[] z = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            z[i] = array[i];

        }
        return z;
    }
}
