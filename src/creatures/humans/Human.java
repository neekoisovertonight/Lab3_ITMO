package creatures.humans;

import creatures.LivingBeing;

import java.util.Objects;

abstract public class Human extends LivingBeing {

    protected String name;
    private int age;
    private int fatigue;
    private int surprise;

    public Human(String name, int age, int fatigue, int surprise) {
        this.name = name;
        this.age = age;
        this.fatigue = fatigue;
        this.surprise = surprise;
    }

    @Override
    public void exist() {
        System.out.println("Человек " + name + " создан.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getFatigue() {
        return this.fatigue;
    }

    public int getSurprise() {
        return surprise;
    }

    public void setSurprise(int surprise) {
        this.surprise = surprise;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Human human)) return false;
        return getAge() == human.getAge() && Objects.equals(getName(), human.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fatigue=" + fatigue +
                ", surprise=" + surprise +
                "} ";
    }
}
