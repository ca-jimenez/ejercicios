package ejerecicio2;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double height;

    @Override
    public double area() {

        return base * height / 2;
    }

    public Triangulo(double base, double height) {
        this.base = base;
        this.height = height;
        setName("Triangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
