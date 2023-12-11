package creatures.humans;

public class Parishioner extends Human{
    public Parishioner(String name, int age, int fatigue, int surprise) {
        super(name, age, fatigue, surprise);
    }

    public void cry(){
        setFatigue(getFatigue() + 1);
        System.out.println("Многие " + name + " плачут. Усталость прихожан: " + getFatigue() + ".");
    }

    public void goAway(){
        System.out.print(name + " начинают расходиться. ");
    }
}
