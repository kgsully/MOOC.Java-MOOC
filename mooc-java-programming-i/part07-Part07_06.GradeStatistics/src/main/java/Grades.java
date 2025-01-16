
import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> gradeList;

    public Grades() {
        this.gradeList = new ArrayList<>();
    }

    public void add(int grade) {
        if (grade > 0 && grade <= 100) {
            this.gradeList.add(grade);
        }
    }

    public double getAverageAll() {
        int sum = 0;
        for (int grade : this.gradeList) {
            sum += grade;
        }
        return (double) sum / this.gradeList.size();
    }

    public int getCountPassing() {
        int count = 0;
        for (int grade : this.gradeList) {
            if (grade >= 50) {
                count ++;
            }
        }

        return count;
    }

    public double getAveragePassing() {
        int sum = 0;
        int count = 0;
        for (int grade : this.gradeList) {
            if (grade >= 50) {
                sum += grade;
                count ++;
            }
        }

        if (count == 0) {
            return -1;
        }
        return (double) sum / count;
    }

    public double getPassingPercentage() {
        int countPassing = this.getCountPassing();
        return (100.0 * countPassing) / this.gradeList.size();
    }

    public String getGradeDistribution() {
        String[] gradeDist = {"", "", "", "", "", ""};
        for (int grade : this.gradeList) {
            if (grade >= 90) {
                gradeDist[5] += "*";
            } else if (grade >= 80) {
                gradeDist[4] += "*";
            } else if (grade >= 70) {
                gradeDist[3] += "*";
            } else if (grade >= 60) {
                gradeDist[2] += "*";
            } else if (grade >= 50) {
                gradeDist[1] += "*";
            } else {
                gradeDist[0] += "*";
            }
        }

        return "Grade distribution:\n" +
                "5: " + gradeDist[5] + "\n" +
                "4: " + gradeDist[4] + "\n" +
                "3: " + gradeDist[3] + "\n" +
                "2: " + gradeDist[2] + "\n" +
                "1: " + gradeDist[1] + "\n" +
                "0: " + gradeDist[0];
    }

}
