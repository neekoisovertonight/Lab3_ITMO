package creatures.humans;

import creatures.humans.moves.IsPorter;

public class NormaBrother extends Human implements IsPorter {
    public NormaBrother(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
    }

    @Override
    public void carry() {
        System.out.println(getName() + " является носильщиком.");
    }
}
