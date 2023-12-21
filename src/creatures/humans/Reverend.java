package creatures.humans;

import creatures.gods.God;
import creatures.gods.MainGod;
import creatures.humans.moves.IsDead;
import creatures.humans.moves.Speakable;

public class Reverend extends Human implements Speakable {
    private God god;

    public Reverend(String name, int age, int fatigue, int surprise, God god) {
        super(name, age, fatigue, surprise);
    }

    public void pray(IsDead human, God god){
        System.out.print(name + " произносит молитву, просит " + god.getName() + " о вечном благословлении. ");
        human.blessing();
    }

    @Override
    public void speak(String phrase) {
        System.out.println(name + " говорит: Готовы ли носильщики?");
    }
}
