package objects;

public abstract class RealObject {
    protected String name;

    public RealObject(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void exist();
}
