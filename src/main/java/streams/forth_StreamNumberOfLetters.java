package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;


public class forth_StreamNumberOfLetters {
    public static void main(String[] args) {
        forth_StreamNumberOfLetters o = new forth_StreamNumberOfLetters();
        o.noOfLetters(o.list());
    }

    public List<String> list(){

        List<String> list = new ArrayList<>();
        list.add("franek");
        list.add("kimono");
        list.add("dupa");
        list.add("szczebrzeszyn");
        list.add("ala");
       return list;
    }

        public void noOfLetters(List<String> arr){
                 arr.stream().mapToInt(String::length).forEach(System.out::println);
    }
}
