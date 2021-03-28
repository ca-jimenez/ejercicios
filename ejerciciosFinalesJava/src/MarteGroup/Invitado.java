package MarteGroup;

public abstract class Invitado {

    private String name;

    public Invitado(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void eatCake();
}
