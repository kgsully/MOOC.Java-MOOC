
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String sentence = scanner.nextLine();
            if (sentence.length() == 0) {
                break;
            }
            String[] splitSentence = sentence.split(" ");
            for (int i = 0; i < splitSentence.length; i++) {
                System.out.println(splitSentence[i]);
            }
        }

    }
}
