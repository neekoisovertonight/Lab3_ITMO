package creatures.humans;

import enums.*;
import creatures.humans.moves.*;

public class Louis extends Human implements Seatable, Speakable, IsPorter {

    public boolean getBlindness() {
        return blindness;
    }

    public void setBlindness(boolean blindness) {
        this.blindness = blindness;
    }

    private boolean blindness;

    public boolean isReadyToStand() {
        return readyToStand;
    }

    public void setReadyToStand(boolean readyToStand) {
        this.readyToStand = readyToStand;
    }

    private boolean readyToStand;

    public Louis(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
        this.blindness = true;
        this.readyToStand = false;
    }

    @Override
    public void sit(Human human) {
        {
            if (getFatigue() > 0) {
                setFatigue(getFatigue() - 1);
            }
            System.out.println(name + " сидит " + Prepositions.ON.getName() + " " + Locations.BENCH.getName() + " " + Prepositions.NEXTTO.getName() + " " + Prepositions.WITH.getName() + " " + human.getName() + ". Усталость: " + getFatigue());
        }
    }

    @Override
    public void speak(String phrase) {
        System.out.print(name + " говорит: ");
        switch (phrase) {
            case "phrase1":
                System.out.println("Сойдешь со ступенек, и я буду там.");
                break;
            case "phrase2":
                System.out.println("Нет-нет.");
                break;
            case "phrase3":
                System.out.println("Что, малышка?");
                break;
        }
    }

    public void whisper(String message) {
        System.out.print(name + " шепчет: ");
        switch (message) {
            case "message1":
                System.out.println("Я один из носильщиков, дорогая.");
                break;
            case "message2":
                System.out.println("Мы должны вынести Норму. Вчетвером — я, двое племянников Джуда и брат Нормы.");
                break;
        }
    }


    @Override
    public void hear() {
        setSurprise(getSurprise() + 1);
        System.out.println(name + " слышит это. Удивление: " + getSurprise() + ".");
    }


    public void performHear(EllieMoves otherMoves) {
        if (otherMoves != null) {
            otherMoves.bowHead();
            otherMoves.neckCrack();
            this.hear();
        }
    }

    public void seeFromSide(String scenario, Ellie ellie, Hedge hedge) {
        if (ellie != null && hedge != null) {
            if (Adjectives.RARELY.getName().equals(scenario)) {
                setSurprise(getSurprise() + 1);
                System.out.println(name + " смотрит на " + ellie.getName() + " со стороны. Это происходит " + scenario + ". Удивление: " + getSurprise());
                blindness = false;
                System.out.println(name + " чувствует, как его слепота из-за любви уменьшается. Cлепота из-за любви: " + getBlindness());
            } else if (Adjectives.USUAL.getName().equals(scenario)) {
                setBlindness(true);
                System.out.println(scenario + " " + name + " ослеплен любовью к " + ellie.getName() + " и " + hedge.getName() + "у. Слепота из-за любви: " + getBlindness());
            }
        } else {
            System.out.println(name + " не может посмотреть на ничто.");
        }
    }

    public void think(Ellie ellie) {
        if (!blindness && ellie != null) {
            System.out.print("Теперь " + name + " думает, что " + ellie.getName() + " - " + Adjectives.CLASSIC.getName() + " " + Nouns.EXAMPLE.getName() + " " + Nouns.CHILD.getName() + ", " + Adjectives.WHICH.getName() + " ");
            ellie.startTransition();
        } else {
            System.out.println(name + " ослеплён и не может думать.");
        }
    }

    public void seeOnly(Human human) {
        setSurprise(getSurprise() + 1);
        System.out.println(name + " видел " + human.getName() + " только в обычной одежде. Удивление Луиса: " + getSurprise());
    }

    public void getUp() {
        readyToStand = true;
        System.out.println(name + " собирается вставать. Готовность вставать: " + isReadyToStand() + ".");
    }

    public void go() {
        System.out.print(name + " почти уходит. ");
    }

    public void almostSit() {
        setReadyToStand(false);
        System.out.println(name + " на момент приседает. Готовность вставать: " + isReadyToStand() + ".");
    }

    @Override
    public void carry() {
        System.out.println(name + " является носильщиком.");
    }

    @Override
    public void comeClose(Human human) {
        System.out.println(getName() + " подходит к " + human.getName() + ".");
    }

    public void putHand(Ellie ellie) {
        ellie.setFear(false);
        System.out.println(name + " кладет руку на плечо " + ellie.getName() + ". Испуг Элли: " + ellie.isFear() + ".");
    }

    public void lookBack(NormaBrother brother, JudeNephew nephewOne, JudeNephew nephewTwo, Jude jude) {
        if (brother.isClose() && nephewOne.isClose() && nephewTwo.isClose()) {
            setSurprise(getSurprise() + 1);
            System.out.println(getName() + " оглядывается. Остальные уже подошли. Удивление: " + getSurprise() + ".");
        } else {
            setSurprise(getSurprise() - 1);
            System.out.println(this.name + " оглядывается. Остальные ещё не подошли. Удивление: " + getSurprise() + ".");
        }
    }
}
