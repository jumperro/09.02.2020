package interfaces.Logowanie;



import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please provideyour login: ");
        String a = scn.next();

        ConsoleLogger console = new ConsoleLogger();
        FileLogger toFile = new FileLogger();
        console.log(a);
        toFile.log(a);
//          File file1 = new File("D://KURS//09.02.2020//Maven//src//main//java//interfaces//Logowanie//log.txt");
//      System.out.println(file1.length());

    }
}
