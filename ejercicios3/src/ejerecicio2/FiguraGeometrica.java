package ejerecicio2;

public abstract class FiguraGeometrica {

    public abstract double area();

    private String name;

    //ToDo (punto 2)
    @Override
    public String toString() {
        return name + ", area " + this.area();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
