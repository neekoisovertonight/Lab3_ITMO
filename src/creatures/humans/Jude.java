package creatures.humans;

import enums.*;
import creatures.humans.moves.*;

public class Jude extends Human implements Wearable, Speakable {

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    private int style;

    public Jude(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
        this.style = 0;
    }

    @Override
    public void wear(String clothing) {
        if (clothing != null && !clothing.isEmpty()) {
            setStyle(getStyle() + 1);
            System.out.print(Time.TODAY.getName() + " " + name + " надел " + clothing + ". Стиль: " + getStyle() + ". ");
        } else {
            setStyle(0);
            System.out.println(Adjectives.USUAL.getName() + " " + name + " надевает " + Adjectives.GREEN.getName() + " " + Adjectives.RUBBER.getName() + " " + Nouns.WELLINGTONS.getName() + ". Стиль: " + getStyle() + ".");
        }
    }

    @Override
    public void speak(String phrase) {
        System.out.print(name + " говорит: Молодец, что пришла, малышка. Думаю, Норма тоже рада. ");
    }

    @Override
    public void hear() {
    }

    public void lean(Ellie ellie) {
        System.out.print(name + " наклоняется к " + ellie.getName() + ". ");
        ellie.setCalm(false);
        ellie.stayCalm();
    }

    public void kiss(Ellie ellie, String partOfBody) {
        System.out.print(name + " целует " + ellie.getName() + " " + Prepositions.INTO.getName() + " " + partOfBody + ". ");
        ellie.setCalm(true);
        ellie.stayCalm();
    }
}
