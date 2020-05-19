import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int counter = 0;

            System.out.print("Quantidade De Tempo a Cronometrar (em minutos): ");
            counter = sc.nextInt();

            for (int min = 0; min < counter; min++) {
                for (int secs = 0; secs < 60; secs++) {
                    String messageMinutes = String.format("%02d", min);
                    String messageSeconds = String.format("%02d", secs);

                    System.out.printf("00:%s:%s\n", messageMinutes, messageSeconds);

                    Delay.delayOneSecond();
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println(MessageFormat.format("Error: {0}", e));
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println(MessageFormat.format("Error: {0}", e));
        }
        catch(Exception e) {
            System.out.println(MessageFormat.format("Error: {0}", e));
        }
    }
}
