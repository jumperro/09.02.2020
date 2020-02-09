package tablice;

import java.util.Arrays;

public class czwarte {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(equals(arr, arr2));
        System.out.println("można też tak \n"+Arrays.equals(arr,arr2));

    }

    public static boolean equals(int[] arr, int[] arr2) {
        boolean b=false;
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == arr2[i]) {
                    b=true;
                }
                else  {
                    return false;
                }

            }
        } else
            return false;

        return b;

        /*Arrays.equals(arr,arr2);*/
    }


}

