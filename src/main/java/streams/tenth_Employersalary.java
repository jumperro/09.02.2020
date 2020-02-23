package streams;

import java.util.*;
import java.util.stream.Collectors;

public class tenth_Employersalary {
    public static void main(String[] args) {
List<Employer> list= new LinkedList<>();
Employer first = new Employer("Jan","Kowalski",1960);
Employer sec = new Employer("Kacper","Waluszkiewicz",2400);
Employer third = new Employer("Tadeusz","Malinowski",2250);
Employer fourth = new Employer("Zofia","Lange",2300);
Employer fifth = new Employer("Jadwiga","Banaszak",2450);
Employer sixth = new Employer("Patryk","Bilski",2350);
Employer seventh = new Employer("Jarosław","Klita",2700);
Employer eight = new Employer("Roman","Nadolny",2500);
Employer ninth = new Employer("Patrycja","Lange",2650);
Employer tenth = new Employer("Grzegorz","Potocki",3500);
list.add(first);
list.add(sec);
list.add(third);
list.add(fourth);
list.add(tenth);
list.add(ninth);
list.add(eight);
list.add(seventh);
list.add(sixth);
list.add(fifth);


    list.stream().sorted((z,b)->z.salary-b.salary).forEach(System.out::println);

    list.stream().mapToInt(i->i.salary).average().ifPresent(avg -> System.out.println("Average found is " + avg));

    Double y = list.stream().mapToInt(i->i.salary).average().getAsDouble();


     list.stream()
             .filter(i->i.salary>y)
            .forEach(System.out::println);







    }
}
