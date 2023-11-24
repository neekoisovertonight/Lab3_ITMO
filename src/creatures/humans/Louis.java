package creatures.humans;

import enums.*;
import creatures.humans.moves.OtherMoves;
import creatures.humans.moves.Speakable;
import creatures.humans.moves.Seatable;

public class Louis extends Human implements Seatable, Speakable {

    public int getBlindness() {
        return blindness;
    }

    public void setBlindness(int blindness) {
        this.blindness = blindness;
    }

    private int blindness;

    public Louis(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
        this.blindness = 1;
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
        System.out.println(name + " слышит это.");
    }


    public void performHear(OtherMoves otherMoves) {
        if (otherMoves != null) {
            otherMoves.bowHead();
            otherMoves.neckCrack();
            this.hear();
        }
    }

    public void seeFromSide(String scenario, Ellie ellie, Hedge hedge) {
        if (ellie != null) {
            if (Adjectives.RARELY.getName().equals(scenario)) {
                System.out.println(name + " смотрит на " + ellie.getName() + " со стороны. Это происходит " + scenario + ".");
                for (int i = blindness; i > 0; i--) {
                    blindness -= 1;
                    System.out.println(name + " чувствует, как его слепота из-за любви уменьшается. Уровень слепоты: " + blindness);
                }

            } else if (Adjectives.USUAL.getName().equals(scenario)) {
                System.out.println(scenario + " " + name + " ослеплен любовью к " + ellie.getName() + " и " + hedge.getName() + "у.");
            }
        } else {
            System.out.println(name + " не может посмотреть на ничто.");
        }
    }

    public void observeEllieTransition(Ellie ellie) {
        if (ellie != null) {
            ellie.startTransition();
            ellie.confusion();
        } else {
            System.out.println("Луис не может наблюдать за ничем.");
        }
    }

    public void think(Ellie ellie) {
        System.out.print("Теперь " + name + " думает, что " + ellie.getName() + " - " + Adjectives.CLASSIC.getName() + " " + Nouns.EXAMPLE.getName() + " " + Nouns.CHILD.getName() + ", " + Adjectives.WHICH.getName() + " ");
        observeEllieTransition(ellie);
    }

    public void seeOnly(Human human) {
        setSurprise(getSurprise()+1);
        System.out.println(name + " видел " + human.getName() + " только в обычной одежде. Удивление Луиса: " + getSurprise());
    }
}
