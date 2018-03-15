package soundsystem;

public class SgtPeppers implements CompactDisc {
    private String title = "Stg. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Odtwarzam utwór " + title + " artysty " + artist);
    }
}