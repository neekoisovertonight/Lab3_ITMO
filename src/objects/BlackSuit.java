package objects;

import enums.Adjectives;
import enums.Nouns;
import enums.Prepositions;

public class BlackSuit extends RealObject {
    public BlackSuit() {
        super(Adjectives.ELEGANT.getName() + " " + Adjectives.BLACK.getName() + " " + Nouns.SUIT.getName() + " и " + Nouns.BOOTS.getName() + " " + Prepositions.ON.getName() + " " + Nouns.LACES.getName());
    }

}
