import java.io.IOException;

public class SpamRunner {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        while (true) {
            System.out.println("try num " + count++);
            try {
                Spam.send();
            } catch (IOException | InterruptedException e) {
               e.printStackTrace();
            }
            Thread.sleep(2000);
        }
    }
}
