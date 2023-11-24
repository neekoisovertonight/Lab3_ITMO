package creatures.humans;

import creatures.humans.moves.Speakable;

public class ReverendLaughing extends Human implements Speakable {
    public ReverendLaughing(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
    }

    @Override
    public void speak(String phrase) {
        System.out.println(name + " произносит молитву.");
    }

    @Override
    public void hear() {

    }
}
