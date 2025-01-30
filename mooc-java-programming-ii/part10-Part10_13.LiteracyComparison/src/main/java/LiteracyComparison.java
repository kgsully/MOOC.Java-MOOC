
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.split(","))
                .sorted((p1, p2) -> {
                    if (Double.valueOf(p1[5]) == Double.valueOf(p2[5])) {
                        return 0;
                    } else if (Double.valueOf(p1[5]) < Double.valueOf(p2[5])) {
                        return -1;
                    } else {
                        return 1;
                    }
                })
                .forEach(i -> System.out.println(i[3] + " (" + i[4] + "), " + i[2].trim().substring(0, i[2].length() - 5) + ", " + i[5]));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}


// SOLUTION CODE AFTER SUBMISSION:
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.ArrayList;

// public class LiteracyComparison {

//     public static void main(String[] args) {
//         ArrayList<Result> results = new ArrayList<>();

//         try {
//             Files.lines(Paths.get("literacy.csv"))
//                     .map(l -> l.split(","))
//                     .map(a -> new Result(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
//                     .forEach(t -> results.add(t));
//         } catch (IOException ex) {
//             System.out.println("Error reading file.");
//         }

//         results.stream().sorted((t1, t2) -> {
//             if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
//                 return 1;
//             }
//             if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
//                 return -1;
//             }
//             return 0;
//         }).forEach(t -> System.out.println(t));
//     }
// }

// public class Result {

//     private String sex;
//     private String country;
//     private int year;
//     private double literacyPercent;

//     public Result(String sex, String country, int year, double literacyPercent) {
//         this.sex = sex;
//         this.country = country;
//         this.year = year;
//         this.literacyPercent = literacyPercent;
//     }

//     public double getLiteracyPercent() {
//         return literacyPercent;
//     }

//     @Override
//     public String toString() {
//         return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyPercent;
//     }
// }
