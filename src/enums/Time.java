package enums;

public enum Time {
    TODAY("Сегодня");
    private String name;

    Time(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
