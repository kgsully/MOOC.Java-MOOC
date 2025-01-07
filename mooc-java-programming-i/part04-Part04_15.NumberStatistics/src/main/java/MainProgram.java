
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!

        // Test code - Part 1
        // Statistics statistics = new Statistics();
        // statistics.addNumber(3);
        // statistics.addNumber(5);
        // statistics.addNumber(1);
        // statistics.addNumber(2);
        // System.out.println("Count: " + statistics.getCount());

        // Test code - Part 2
        // Statistics statistics = new Statistics();
        // statistics.addNumber(3);
        // statistics.addNumber(5);
        // statistics.addNumber(1);
        // statistics.addNumber(2);
        // System.out.println("Count: " + statistics.getCount());
        // System.out.println("Sum: " + statistics.sum());
        // System.out.println("Average: " + statistics.average());

        // Code - Part 3
        // Statistics statistics = new Statistics();

        // System.out.println("Enter numbers:");
        // while (true) {
        //     int num = Integer.valueOf(scanner.nextLine());
        //     if (num == -1) {
        //         break;
        //     }

        //     statistics.addNumber(num);
        // }

        // System.out.println(statistics.sum());

        // Code - Part 4
        Statistics allStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                evenStatistics.addNumber(num);
            } else {
                oddStatistics.addNumber(num);
            }
            allStatistics.addNumber(num);
        }

        System.out.println("Sum: " + allStatistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}
