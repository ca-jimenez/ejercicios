package MarteGroup;

public abstract class Explosive {

    private String name;


    public Explosive(String name) {
        this.name = name;
    }

    public Explosive() {
    }

    public void explode() {
        System.out.println("Blam!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
