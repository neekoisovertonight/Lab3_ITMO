package creatures.humans;

import enums.Adjectives;
import enums.Nouns;
import enums.Prepositions;
import enums.Time;
import creatures.humans.moves.OtherMoves;
import creatures.humans.moves.Speakable;

public class Jude extends Human implements OtherMoves, Speakable {
    public Jude(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
    }


    @Override
    public void bowHead() {
    }

    @Override
    public void neckCrack() {
    }

    @Override
    public void wear(String clothing) {
        if (clothing != null && !clothing.isEmpty()) {
            System.out.print(Time.TODAY.getName() + " " + name + " надел " + clothing + ". ");
        } else {
            System.out.println(Adjectives.USUAL.getName() + " " + name + " надевает " + Adjectives.GREEN.getName() + " " + Adjectives.RUBBER.getName() + " " + Nouns.WELLINGTONS.getName() + ". ");
        }
    }

    @Override
    public void speak(String phrase) {
        System.out.println(name + " говорит: Молодец, что пришла, малышка. Думаю, Норма тоже рада.");
    }

    @Override
    public void hear() {
    }

    public void lean(Ellie ellie){
        System.out.println(name + " наклоняется к " + ellie.getName() + ".");
        ellie.setCalm(false);
        ellie.stayCalm();
    }
    public void kiss(Ellie ellie, String partOfBody) {
        System.out.println(name + " целует " + ellie.getName() + " " + Prepositions.INTO.getName() + " " + partOfBody + ".");
        ellie.setCalm(true);
        ellie.stayCalm();
    }
}
