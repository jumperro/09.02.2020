package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class third_StremUppercase {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Kasia");
        list.add("Basia");
        list.add("Stasia");
        list.add("Zuzia");
        list.add("Sara");
        list.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
