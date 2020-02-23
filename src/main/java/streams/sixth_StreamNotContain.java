package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class sixth_StreamNotContain {
    public static void main(String[] args) {
        sixth_StreamNotContain o = new sixth_StreamNotContain();
        System.out.println(o.list());
        System.out.println(o.ifNotContain(o.list()));

    }

    public List list() {
        int arr[] = new int[8];
        Random r = new Random();
        int a;
        for (int i = 0; i < arr.length; i++) {
            a = r.nextInt(20) - 2;
            for (int j =0;j<=i;j++){
                if(arr[j]!=a) {
                    arr[i] = a;
                }if(arr[j]==a) {
                    a = r.nextInt(20)-2;
                }
            }
        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public boolean ifNotContain(List<Integer> list){
        return list.stream().anyMatch(el -> el == 12);
    }


}
