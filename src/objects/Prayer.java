package objects;

import enums.Adjectives;
import enums.Nouns;

public class Prayer extends RealObject{
    public Prayer(String name) {
        super(name);
    }
     public void give(){
        System.out.println(name + " дарит " + Adjectives.ENDLESS.getName() + " " + Nouns.PEACE.getName() + ".");
     }
}
