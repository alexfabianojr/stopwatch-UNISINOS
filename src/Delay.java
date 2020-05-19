import java.text.MessageFormat;

public class Delay {
    public static void delayOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(MessageFormat.format("Error: {0}", e));
        }
    }
}
