
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumYears = 0;
        int entryQty = 0;
        String longestName = "";

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int year = Integer.valueOf(parts[1]);
            sumYears += year;
            entryQty++;

            if(parts[0].length() > longestName.length()) {
                longestName = parts[0];
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumYears / entryQty));

    }
}

// Alternative Solution using ArrayLists:
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         ArrayList<String> names = new ArrayList<>();
//         ArrayList<Integer> birthYears = new ArrayList<>();

//         while (true) {

//             String input = scanner.nextLine();
//             if (input.equals("")) {
//                 break;
//             }

//             String[] parts = input.split(",");
//             names.add(parts[0]);
//             birthYears.add(Integer.valueOf(parts[1]));
//         }

//         String longest = names.get(0);
//         for (String name : names) {
//             if(name.length() > longest.length()) {
//                 longest = name;
//             }
//         }

//         System.out.println("Longest name: " + longest);

//         int sumOfBirthYears = 0;

//         for (int year : birthYears) {
//             sumOfBirthYears = sumOfBirthYears + year;
//         }

//         System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears / birthYears.size());



//     }
