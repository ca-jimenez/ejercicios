package MarteGroup;

public class FireworkIndividual extends Firework {

    private String name;


    public FireworkIndividual(String name) {
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
}
