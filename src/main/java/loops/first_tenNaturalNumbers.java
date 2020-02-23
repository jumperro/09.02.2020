package loops;

import java.util.Arrays;

public class first_tenNaturalNumbers {
    public static void main(String[] args) {

        first_tenNaturalNumbers o = new first_tenNaturalNumbers();
        System.out.println(Arrays.toString(o.tenNaturalNumbers()));
    }

    public int[] tenNaturalNumbers(){
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*100);
        }
        return arr;
    }
}
