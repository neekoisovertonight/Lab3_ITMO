package creatures.humans;

import creatures.humans.moves.IsPorter;

public class NormaBrother extends Human implements IsPorter {
    public boolean isClose() {
        return isClose;
    }

    public void setClose(boolean close) {
        isClose = close;
    }

    private boolean isClose;

    public NormaBrother(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
        this.isClose = false;
    }

    @Override
    public void carry() {
        System.out.println(getName() + " является носильщиком.");
    }

    @Override
    public void comeClose(Human human) {
        System.out.println(getName() + " подходит к " + human.getName() + ".");
        setClose(human instanceof Jude);
    }
}
