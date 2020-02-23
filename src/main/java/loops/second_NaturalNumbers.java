package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class second_NaturalNumbers {
    public static void main(String[] args) {
    second_NaturalNumbers o = new second_NaturalNumbers();
        System.out.println(o.naturalNumbers());
    }
    public List naturalNumbers(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Please tell me, how many natural numbers do you want to be written in the console terminal? : ");
        int a=scn.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<a;i++){
            list.add((int)(Math.random()*100));
        }
        return list;
    }
}
