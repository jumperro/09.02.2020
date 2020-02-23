package interfaces.Logowanie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Time;
import java.util.Date;

public class FileLogger implements logger {
Time time= new Time(System.nanoTime());
Date date = new Date(System.currentTimeMillis());
    @Override
    public void log(String message) throws IOException {
        File file = new File("D://KURS//09.02.2020//Maven//src//main//java//interfaces//Logowanie//log.txt");
        FileWriter writer = new FileWriter("D://KURS//09.02.2020//Maven//src//main//java//interfaces//Logowanie//log.txt",true);

        if (file.length()>0) {
            System.out.println("not empty, lenght: "+file.length());
            writer.append("\n"+message + " ----------------------------->>    " + date);
            System.out.println("Saved to file called log.txt");
            writer.close();
        }
        else {
            System.out.println(" empty");

        }


    }


}
