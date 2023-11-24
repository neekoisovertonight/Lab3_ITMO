package objects;

public class Prayer extends RealObject{
    public Prayer(String name) {
        super(name);
    }

    @Override
    public void exist() {
        System.out.println(name + " дарит ");
    }
}
