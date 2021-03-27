package SaveTheRopa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private int contador;
    private HashMap<Integer, ArrayList<Prenda>> diccionario;

    public GuardaRopa(){
        this.contador = 0;
        diccionario = new HashMap<>();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<Integer, ArrayList<Prenda>> getDiccionario() {
        return diccionario;
    }

    public Integer guardarPrendas(ArrayList<Prenda> listaDePrenda){
        this.contador++;
        this.diccionario.put(this.contador, listaDePrenda);
        return this.contador;
    }

    public void mostrarPrendas(){

        for (Map.Entry<Integer, ArrayList<Prenda>> entry : diccionario.entrySet()) {

            ArrayList<Prenda> prendas = entry.getValue();

            System.out.println("Identificador: " + entry.getKey());
            System.out.println("Prendas:");

            for(Prenda p : prendas){
                System.out.println("Marca: " + p.getMarca() + ", modelo: " + p.getModelo());
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){

        return diccionario.get(numero);
    }
}
