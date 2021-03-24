package ejerecicio2;

public class Rectangulo extends FiguraGeometrica {

    private double length;
    private double width;

    @Override
    public double area() {

        return length * width;
    }

    public Rectangulo(double length, double width) {
        this.length = length;
        this.width = width;
        setName("Rectangulo");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
