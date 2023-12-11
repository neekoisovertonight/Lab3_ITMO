package objects;

import enums.Adjectives;
import enums.Nouns;
import enums.Prepositions;

public class BlueDress extends RealObject {
    public BlueDress() {
        super(Adjectives.BLUE.getName() + " " + Nouns.DRESS.getName() + ", " + Adjectives.BOUGHT.getName() + " " + Adjectives.SPECIALLY.getName() + " " + Prepositions.FOR.getName() + " " + Adjectives.THIS.getName() + " " + Nouns.CASE.getName());
    }

}