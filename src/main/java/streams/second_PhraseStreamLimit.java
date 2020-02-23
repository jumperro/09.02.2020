package streams;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class second_PhraseStreamLimit {
        public static void main(String[] args) {
            List<String> list = new LinkedList<String>();

            list.add("Co ");
            list.add("ja ");
            list.add("robię ");
            list.add("tu");
            list.add(", ");
            list.add("uuuuu");
            list.add(", ");
            list.add("co ");
            list.add("ty");
            list.add("tutaj ");
            list.add("robisz");
            list.add("?");
            list.add(".");

            list.stream().limit(5).forEach(System.out::print);
            System.out.println("\n"+list.stream().limit(5).collect(Collectors.joining()));
        }
    }


