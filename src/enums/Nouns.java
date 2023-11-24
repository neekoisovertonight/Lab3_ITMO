package enums;

public enum Nouns {
    HEAD("голову"),
    DRESS("платьице"),
    NECK("шея"),
    TIME("раз"),
    EXAMPLE("пример"),
    CHILD("ребёнка"),
    SUIT("костюм"),
    BOOTS("ботинки"),
    LACES("шнурках"),
    FOREHEAD("лоб"),
    WELLINGTONS("сапоги"),

    CASE("случая");

    private String name;

    Nouns(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
