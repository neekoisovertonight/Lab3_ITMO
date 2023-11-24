package enums;

public enum Locations {
    CHURCH("в церкви"),
    STAIRS("со ступенек"),
    FUNERAL("на похоронах"),
    BENCH("скамье");
    private String name;

    Locations(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
