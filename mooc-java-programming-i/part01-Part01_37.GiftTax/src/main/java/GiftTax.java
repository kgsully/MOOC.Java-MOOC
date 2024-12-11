
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());

        int base = 0;
        double pct = 0.0;

        if (value >= 1000000) {
            base = 142100;
            pct = 0.17;
            System.out.println("Tax: " + (base + (value - 1000000) * pct));
        } else if (value >= 200000 && value < 1000000) {
            base = 22100;
            pct = 0.15;
            System.out.println("Tax: " + (base + (value - 200000) * pct));
        } else if (value >= 55000 && value < 200000) {
            base = 4700;
            pct = 0.12;
            System.out.println("Tax: " + (base + (value - 55000) * pct));
        } else if (value >= 25000 && value < 55000) {
            base = 1700;
            pct = 0.10;
            System.out.println("Tax: " + (base + (value - 25000) * pct));
        } else if (value >= 5000 && value < 25000) {
            base = 100;
            pct = 0.08;
            System.out.println("Tax: " + (base + (value - 5000) * pct));
        } else {
            System.out.println("No tax!");
        }
    }
}
