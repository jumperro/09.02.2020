package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class fifth_StreamFindVal {
    public static void main(String[] args) {
fifth_StreamFindVal o = new fifth_StreamFindVal();
        System.out.print(o.list()+"\n");
        System.out.println(o.ifHasValue(o.list()));
    }

    public List list(){
        int[] arr = new int[8];
        Random r = new Random();
        int a;
        for (int i=0;i<arr.length;i++) {
            a=r.nextInt(15);
            for(int j=0;j<=i;j++) {

                if(arr[j]!=a) {
                    arr[i] = a;
                }if(arr[j]==a) {
                    a = r.nextInt(15);
                }
            }
            }


        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public boolean ifHasValue(List<Integer> list){
return list.stream().anyMatch(el -> el ==12);


    }
}
