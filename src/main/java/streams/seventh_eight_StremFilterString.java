package streams;

import java.util.*;
import java.util.stream.Collectors;

public class seventh_eight_StremFilterString {
    public static void main(String[] args) {
        seventh_eight_StremFilterString o = new seventh_eight_StremFilterString();
        List<String> list = new LinkedList<>();
        list.add("Jan");
        list.add("Robert");
        list.add("Maariola");
        list.add("Agnieszka");
        list.add("Franciszek");
        list.add("Genowefa");
        list.add("Irena");
        list.add("Józef");
        list.add("Dagmara");
        list.add("Ewa");
        list.add("Adam");

        System.out.println("szukam imienia Jan \n"+list.stream().filter(el->el.equals("Jan")).findFirst().orElse("No match")+"\n\n\n\nSortuję: ");
        o.sort(list);
        System.out.println("\n\nSortowanie Z->A: ");
        o.reversSort(list);

    }
    public void sort(List<String> list){

       list.stream().sorted(String::compareTo).forEach(System.out::println);
    }

    public void reversSort(List<String> list){
        list.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
    }

}

