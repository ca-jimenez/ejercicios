package MarteGroup;

public class Firework extends Explosive {

    private String name;


    public Firework(String name) {
        this.name = name;
    }

    public Firework() {
    }

//    public void explode() {
//        System.out.println("Blam!");
//    }


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
