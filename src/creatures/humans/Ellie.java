package creatures.humans;

import creatures.humans.moves.*;
import enums.*;


public class Ellie extends Human implements Seatable, Speakable, Whisperable, EllieMoves, Wearable {
    private int beauty;
    private boolean isCalm;
    private int confusion;
    private boolean fear;

    public boolean isFear() {
        return fear;
    }

    public void setFear(boolean fear) {
        this.fear = fear;
    }

    public Ellie(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
        this.beauty = 0;
        this.isCalm = true;
        this.confusion = 0;
        this.fear = false;
    }
    @Override
    public void whisper(String message) {
        System.out.println(name + " шепчет: " + message + ".");
    }

    public void bowHead() {
        System.out.print("Элли опускает " + Nouns.HEAD.getName() + " " + Prepositions.SO.getName() + " " + Adjectives.LOW.getName() + ", что ");
    }

    @Override
    public void speak(String phrase) {
        System.out.println(name + " говорит: " + phrase);
    }

    public int getBeauty() {
        return beauty;
    }

    public void setBeauty(int beauty) {
        this.beauty = beauty;
    }

    public int getConfusion() {
        return confusion;
    }

    public void setConfusion(int confusion) {
        this.confusion = confusion;
    }

    public boolean isCalm() {
        return isCalm;
    }

    public void setCalm(boolean calm) {
        isCalm = calm;
    }

    @Override
    public void sit(Human human) {
        if (getFatigue() > 0) {
            setFatigue(getFatigue() - 1);
            if (human != null) {
                System.out.println(this.name + " сидит вместе с " + human.getName() + ". Усталость Элли: " + getFatigue());
            } else {
                System.out.println(name + " сидит " + Prepositions.ON.getName() + " " + Locations.BENCH.getName() + ". Усталость Элли: " + getFatigue());
            }
        } else {
            System.out.println("Усталость: " + getFatigue() + ". " + this.name + " чувствует себя отдохнувшей. Она не хочет сидеть.");
        }
    }

    public void neckCrack() {
        setFatigue(getFatigue() + 1);
        System.out.print(Prepositions.HAS.getName() + " неё" + " хрустит " + Nouns.NECK.getName() + ". Усталость: " + getFatigue() + ". ");
    }

    @Override
    public void wear(String clothing) {
        if (clothing != null && !clothing.isEmpty()) {
            beauty += 1;
            System.out.println(Time.TODAY.getName() + " " + name + " надела " + clothing + ". Красота Элли: " + beauty);
        } else {
            System.out.println(name + " не может надеть ничего.");
        }

    }

    public void beInChurch() {
        setSurprise(getSurprise() + 1);
        System.out.println(name + " " + Adjectives.RARELY.getName() + " бывает " + Locations.CHURCH.getName() + ". Удивление: " + getSurprise());
    }

    public void beOnFuneral() {
        setFatigue(4);
        System.out.println(name + " " + Adjectives.FIRST.getName() + " " + Nouns.TIME.getName() + " " + Locations.FUNERAL.getName()  + ". Это сильно влияет на неё. Усталость: " + getFatigue());
    }

    public void stayCalm() {
        if (isCalm) {
            System.out.println(name + " сохраняет спокойствие.");
        } else {
            System.out.println(name + " не может сохранить спокойствие.");
        }
    }

    public void startTransition() {
        setFear(true);
        System.out.println("переживает важный переходный этап своей жизни. Страх: " + isFear() + ".");
    }

    public void getConfused() {
        setConfusion(getConfusion() + 1);
        System.out.println(name + " чувствует непонимание происходящего вокруг себя. Непонимание Элли: " + getConfusion() + ".");
    }

    public void openEyes(Jude jude, Norma norma) {
        jude.speak("");
        norma.becomeHappy();
        System.out.print(name + " широко открывает глаза и смотрит на " + jude.getName() + ". ");
        confusion++;
        System.out.println("Удивление " + name + " увеличено: " + confusion + ".");
    }

    public void grabPerson(Louis louis) {
        louis.getUp();
        if (louis.isReadyToStand()) {
            setFear(true);
            System.out.println(name + " хватает " + louis.getName() + ". Испуг " + name + ": " + isFear() + ".");
            whisper("Папа! Ты куда?");
        } else {
            System.out.println(name + " не может схватить. Испуг " + name + ": " + isFear() + ".");
        }
    }

    public void catchHand(Louis louis) {
        louis.go();
        setFear(true);
        System.out.println(name + " ловит его руку. Испуг: " + isFear() + ".");
    }
}

