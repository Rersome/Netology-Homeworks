import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int counter = 1;
    @Override
    public void log(String msg) {
        String logType = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";
        System.out.println(logType + "#" + counter + " [" + LocalDateTime.now() + "] " + msg);
        counter++;
    }
}
