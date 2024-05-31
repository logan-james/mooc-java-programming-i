
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    // Challenge
    public boolean equals(Object compared) {
        // if the variable are located in the same position, they're equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Song, the object are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Song object (type casting)
        Song comparedSong = (Song) compared;

        // if values of the object variables are equal, the objects are equal
        if (this.artist.equals(comparedSong.artist) &&
                this.name.equals(comparedSong.name) &&
                this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
