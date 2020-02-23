package loops;

import java.util.Arrays;
import java.util.Random;

public class ninth_tenElArray {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random r = new Random();
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++) {
             if((r.nextInt(10001)+14)!=arr[j])
                arr[i] = r.nextInt(10001) + 14;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
