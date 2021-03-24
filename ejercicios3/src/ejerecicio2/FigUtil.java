package ejerecicio2;

public class FigUtil {

    public static double areaPromedio(FiguraGeometrica[] arr) {

        double sum = 0;

        for (FiguraGeometrica fig: arr) {

            sum += fig.area();
        }

        return sum / arr.length;
    }
}
