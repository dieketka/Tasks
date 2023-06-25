package Lesson12;

import java.util.Optional;

public class Computer {

    private Optional<SoundCard> soundcard;


    public Optional<SoundCard> getSoundcard() {


        SoundCard soundcard = new SoundCard();
        Optional<SoundCard> sc = Optional.of(soundcard);

        return sc;
    }

}
