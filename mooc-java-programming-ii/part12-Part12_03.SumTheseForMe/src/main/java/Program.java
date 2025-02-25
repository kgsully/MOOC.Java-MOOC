
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

    // Calculates the sum of the elements in the array between the lower and the upper limits.
    // Only numbers smaller or equal to the int largest and larger or equal to the int smallest are added to the sum.

    // The method must also check that the lower and the upper limit are valid indexes in the array.
    // If the parameter fromWhere is smaller than 0, the lower limit becomes 0 instead.
    // Accordingly, if the parameter toWhere is larger than the size of the array,
    // the upper limit becomes the last index of the array instead.

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {

        int sum = 0;

        // Perform bounds checks and set start and stop indexes accordingly
        int idxStart = fromWhere < 0 ? 0 : fromWhere;
        // System.out.println("Start Index: " + idxStart);

        int idxStop = toWhere > (array.length - 1) ? (array.length - 1) : toWhere;
        // System.out.println("Stop Index: " + idxStop);

        for (int i = idxStart; i <= idxStop; i++) {

            if (array[i] >= smallest && array[i] <= largest) {
                // System.out.print(sum + " + " + array[i] + " = ");
                sum += array[i];
                // System.out.println(sum);
            }

        }

        return sum;
    }

}
