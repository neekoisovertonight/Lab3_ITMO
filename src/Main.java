import enums.*;
import creatures.humans.*;
import objects.*;

public class Main {
    public static void main(String[] args) {
        Ellie ellie = new Ellie("Элли", 8, 3, 0);
        Louis louis = new Louis("Луис", 28, 2, 0);
        Jude jude = new Jude("Джуд", 30, 2, 0);
        Hedge hedge = new Hedge("Гэдж", 2, 0, 0);
        ReverendLaughing reverendLaughing = new ReverendLaughing("Преподобный Лафлин", 40, 0, 0);
        BlackSuit blackSuit = new BlackSuit(Adjectives.ELEGANT.getName() + " " + Adjectives.BLACK.getName() + " " + Nouns.SUIT.getName() + " и " + Nouns.BOOTS.getName() + " " + Prepositions.ON.getName() + " " + Nouns.LACES.getName());
        BlueDress blueDress = new BlueDress(Adjectives.BLUE.getName() + " " + Nouns.DRESS.getName() + ", " + Adjectives.BOUGHT.getName() + " " + Adjectives.SPECIALLY.getName() + " " + Prepositions.FOR.getName() + " " + Adjectives.THIS.getName() + " " + Nouns.CASE.getName());
        Prayer prayer = new Prayer("молитва");
        System.out.println("Непонимание Элли: " + ellie.getConfusion());
        System.out.println("Красота Элли: " + ellie.getBeauty());
        System.out.println("Усталость Элли: " + ellie.getFatigue());
        System.out.println("Усталость Луиса: " + louis.getFatigue());
        System.out.println("Удивление Луиса: " + louis.getSurprise());
        System.out.println("Слепота из-за любви Луиса: " + louis.getBlindness());
        ellie.sit(ellie);
        louis.sit(ellie);
        ellie.wear(blueDress.getName());
        louis.performHear(ellie);
        ellie.be(Locations.CHURCH.getName());
        ellie.be(Locations.FUNERAL.getName());
        louis.seeFromSide(Adjectives.RARELY.getName(), ellie, hedge);
        louis.seeFromSide(Adjectives.USUAL.getName(), ellie, hedge);
        louis.think(ellie);
        jude.wear("");
        jude.wear(blackSuit.getName());
        louis.seeOnly(jude);
        jude.lean(ellie);
        jude.kiss(ellie, Nouns.FOREHEAD.getName());
        ellie.openEyes(jude);
        reverendLaughing.speak("");
        ellie.speak("phrase1");
        ellie.speak("phrase2");
    }
}