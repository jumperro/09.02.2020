package tablice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ninth {
    public static void main(String[] args) {
        ninth o = new ninth();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] rem = {3, 5};

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(o.removeValues(arr, rem)));


    }
    public int[] removeValues(int [] arr,int [] rem){
        int[] arr2 = new int[arr.length - rem.length];
        int k =0, i=0;
        for (int j = 0; j < arr.length  && k <= arr.length - rem.length; j++) {

            if (rem[i] != arr[j] ) {
                arr2[k] = arr[j];
                k++;
            }
            else if(rem[i]==arr[j] && i<rem.length-1)
                i++;
            else


                System.out.println(" przebieg " + Arrays.toString(arr2) );
        }
        return arr2;
    }

}
