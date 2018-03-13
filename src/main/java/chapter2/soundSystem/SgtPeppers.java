package chapter2.soundSystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Stg. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Odtwarzam utwór " + title + " artysty " + artist);
    }
}
