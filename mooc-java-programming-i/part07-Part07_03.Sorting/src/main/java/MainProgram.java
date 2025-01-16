import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // Original exercise code
        // int[] array = {3, 1, 5, 99, 3, 12};

        // Test code for parts 1 & 2
        // int[] numbers = {6, 5, 8, 7, 11};
        // System.out.println("Smallest: " + MainProgram.smallest(numbers));
        // System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        // Test code for part 3
        // indices:       0  1  2  3   4
        // int[] numbers = {-1, 6, 9, 8, 12};
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        // Test code for part 4
        // int[] numbers = {3, 2, 5, 4, 8};
        // System.out.println(Arrays.toString(numbers));
        // MainProgram.swap(numbers, 1, 0);
        // System.out.println(Arrays.toString(numbers));
        // MainProgram.swap(numbers, 0, 3);
        // System.out.println(Arrays.toString(numbers));

        // Test code for part 5
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    // Single parameter method overload
    public static int smallest(int[] numbers) {
        return smallest(numbers, 0);
    }

    public static int smallest(int[] numbers, int startIndex) {
        int smallest = numbers[startIndex];
        for (int i = startIndex; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] numbers) {
        int smallest = smallest(numbers);
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == smallest) {
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = smallest(table, startIndex);
        int index = -1;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == smallest) {
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempVal = array[index2];
        array[index2] = array[index1];
        array[index1] = tempVal;
    }

    public static void sort(int[] array) {
        // Print initial array
        System.out.println(Arrays.toString(array));

        // Iterate through array, find index of smallest starting from iteration pointer
        // and swap with value at iteration pointer index.
        // Print array at each iteration.
        for(int i = 0; i < array.length - 1; i++) {
            int smallestIdx = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIdx);
            System.out.println(Arrays.toString(array));
        }
    }

}
