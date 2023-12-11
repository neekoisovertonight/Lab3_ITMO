package creatures.humans;

import creatures.humans.moves.IsDead;
import creatures.humans.moves.Speakable;

public class Norma extends Human implements IsDead {
    public boolean isBlessing() {
        return blessing;
    }

    public void setBlessing(boolean blessing) {
        this.blessing = blessing;
    }

    private boolean blessing;

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    private int happiness;

    public Norma(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
        this.blessing = false;
        this.happiness = 0;
    }

    @Override
    public void blessing() {
        blessing = true;
        System.out.println("Вечное благословление даровано. Благословление " + name + ": " + blessing);
    }
    public void becomeHappy(){
        happiness++;
        System.out.println(name + " рада. Радость Нормы: " + happiness);
    }
}
