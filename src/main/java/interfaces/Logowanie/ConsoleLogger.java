package interfaces.Logowanie;

import javax.sound.midi.Soundbank;

public class ConsoleLogger implements logger {
    @Override
    public void log(String message) {
        System.out.println( "Name was accepted."+message);
    }
}
