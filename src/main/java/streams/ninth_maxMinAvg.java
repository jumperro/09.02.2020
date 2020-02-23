package streams;

import java.util.*;

public class ninth_maxMinAvg {
    public static void main(String[] args) {
        ninth_maxMinAvg o = new ninth_maxMinAvg();
        List<Integer> a = new ArrayList<>(o.list());
        System.out.println("Maximum value:  " + a.stream().max((c, b) -> (c - b)).orElse(null));
        System.out.println("Mnimum:  " + a.stream().min((c, b) -> (c - b)).orElse(null));
        System.out.println("Middle:  "+a.get((a.size()-1)/2));
    }

    public List<Integer> list() {
        Set<Integer> set = new HashSet<>();
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            int a = r.nextInt(20) + 1;
                    set.add(a);
            }
        List<Integer> list = new ArrayList<>(set);
        Collections.shuffle(list);
        System.out.println("Check if there are no double numbers : " + list);
        return list;

    }


}