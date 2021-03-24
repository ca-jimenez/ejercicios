package ejerecicio2;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

//        FiguraGeometrica circulo = new Circulo(22);
//
//        FiguraGeometrica triangulo = new Triangulo(20, 15);
//
//        FiguraGeometrica rectangulo = new Rectangulo(45, 30.5);
//
//        System.out.println(circulo);
//        System.out.println(triangulo);
//        System.out.println(rectangulo);
//
//        FiguraGeometrica[] arr = {circulo, triangulo, rectangulo};

        FiguraGeometrica[] arr = new FiguraGeometrica[20];

        for (int i = 0; i < arr.length; i++) {

            double value1 = ThreadLocalRandom.current().nextDouble(1, 80);
            double value2 = ThreadLocalRandom.current().nextDouble(1, 80);

            if (i % 3 == 0) {

                arr[i] = new Circulo(value1);

            } else if (i % 2 == 0) {

                arr[i] = new Triangulo(value1, value2);

            } else {

                arr[i] = new Rectangulo(value1, value2);
            }
            System.out.println(arr[i]);
        }

        System.out.println("Area promedio " + FigUtil.areaPromedio(arr));
    }
}
