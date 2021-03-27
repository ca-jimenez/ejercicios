package SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Prenda nuevaRemera = new Prenda("nike", "remera");
        Prenda pantalon = new Prenda("adidas", "pantalon");
//        Prenda campera = new Prenda("montagne", "campera");
//        Prenda bufanda = new Prenda("montagne", "bufanda");

        ArrayList<Prenda> prendas1 = new ArrayList<Prenda>();

        prendas1.add(nuevaRemera);
        prendas1.add(pantalon);

        GuardaRopa guardaRopa = new GuardaRopa();

        int numeroNuevo = guardaRopa.guardarPrendas(prendas1);
        System.out.println("Se guardaron las prendas con el numero " + numeroNuevo);


//        ArrayList<Prenda> prendas2 = new ArrayList<Prenda>();
//
//        prendas2.add(campera);
//        prendas2.add(bufanda);
//
//        int numeroNuevo2 = guardaRopa.guardarPrendas(prendas2);
//        System.out.println("Se guardaron las prendas con el numero " + numeroNuevo2);


        guardaRopa.mostrarPrendas();
        System.out.println("----------");

        List<Prenda> returnedItems = guardaRopa.devolverPrendas(numeroNuevo);

        System.out.println("Prendas devueltas del numero " + numeroNuevo + ":");

        for (Prenda p : returnedItems) {
            System.out.println("Marca: " + p.getMarca() + ", modelo: " + p.getModelo());
        }
    }
}
