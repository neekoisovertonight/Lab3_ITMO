package enums;

public enum Prepositions {
    FOR("для"),
    ON("на"),
    NEXTTO("рядом"),
    WITH("c"),
    HAS("у"),
    INTO("в"),
    SO("так");
    private String name;

    Prepositions(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
