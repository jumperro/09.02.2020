package loops;

import java.util.Arrays;

public class third_tenElTable {
    public static void main(String[] args) {
    third_tenElTable o = new third_tenElTable();
    int[] arr=new int[10];
        System.out.println(Arrays.toString(o.arrayElements(arr)));
    }

    public int[] arrayElements(int [] arr){

        for(int i =0;i<arr.length;i++)
            arr[i]=(int)(Math.random()*100);

        return arr;
    }

}
