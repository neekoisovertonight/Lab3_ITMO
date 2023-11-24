package enums;

public enum Adjectives {
    BOUGHT("купленное"),
    SPECIALLY("специально"),
    LOW("низко"),
    BLUE("голубое"),
    RARELY("редко"),
    FIRST("первый"),
    USUAL("Обычно"),
    CLASSIC("классический"),
    WHICH("который"),
    ELEGANT("элегантный"),
    BLACK("черный"),
    UNUSUAL("необычно"),
    GREEN("зелёные"),
    RUBBER("резиновые"),
    ENDLESS("вечное"),
    THIS("этого");

    private String name;

    Adjectives(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
