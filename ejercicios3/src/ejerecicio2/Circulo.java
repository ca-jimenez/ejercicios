package ejerecicio2;

public class Circulo extends FiguraGeometrica {

    private double r;

    @Override
    public double area() {

        return Math.PI * Math.pow(r,2);
    }

    public Circulo(double r) {
        this.r = r;
        setName("Circulo");
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
