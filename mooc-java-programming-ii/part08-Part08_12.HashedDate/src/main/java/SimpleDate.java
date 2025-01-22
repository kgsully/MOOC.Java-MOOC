
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    // From previous exercise
    @Override
    public boolean equals(Object object) {
        // Initial check - if references are identical, they are equal
        if (this == object) {
            return true;
        }

        // Alternatively could use this.getClass() != object.getClass() instead of instanceof
        // that would make the code more generic
        if (!(object instanceof SimpleDate)) {
            return false;
        }

        // Cast object to SimpleDate
        SimpleDate compared = (SimpleDate) object;

        // Compare each field to determine whether they are the same
        if (this.day == compared.day &&
            this.month == compared.month &&
            this.year == compared.year) {
                return true;
            }

        return false;
    }

    @Override
    public int hashCode() {
        return this.day * this.month * this.year;
        // From solution:
        // int hash = 5;
        // hash = 19 * hash + this.day;
        // hash = 19 * hash + this.month;
        // hash = 19 * hash + this.year;
        // return hash;
    }

}
