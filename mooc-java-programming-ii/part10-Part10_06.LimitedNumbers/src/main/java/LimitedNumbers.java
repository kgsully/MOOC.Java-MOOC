
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                break;
            }

            nums.add(num);
        }

        nums.stream()
            .filter(n -> n > 0 && n < 6)
            .forEach(i -> System.out.println(i));
    }
}
