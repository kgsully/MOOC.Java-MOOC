
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // if the memory location reference of the variables are equal, then they are equal
        if (this == compared) {
            return true;
        }

        // If the compared variable is not an instance of Song, they are NOT equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // Convert generic Object type to Song via casting
        Song comparedSong = (Song) compared;

        // Check whether the values of the individual object variables are equal.
        if (this.artist.equals(comparedSong.artist) &&
            this.name.equals(comparedSong.name) &&
            this.durationInSeconds == comparedSong.durationInSeconds) {
                return true;
            }

        // If individual values are not equal then the objects are not equal
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
