package creatures.humans;

import creatures.humans.moves.IsPorter;

public class JudeNephew extends Human implements IsPorter {
    public JudeNephew(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
    }

    @Override
    public void carry() {
        System.out.println(getName() + " является носильщиком.");
    }
}
