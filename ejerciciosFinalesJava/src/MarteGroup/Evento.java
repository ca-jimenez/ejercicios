package MarteGroup;

import java.util.ArrayList;

public class Evento {

    private ArrayList<Invitado> guests;

    //    private ArrayList<Firework> fireworks;
    private ArrayList<Explosive> fireworks;


    //    public Evento(ArrayList<Invitado> guests, ArrayList<Firework> fireworks) {
    public Evento(ArrayList<Invitado> guests, ArrayList<Explosive> fireworks) {
        this.guests = guests;
        this.fireworks = fireworks;
    }

    public Evento() {
        guests = new ArrayList<>();
        fireworks = new ArrayList<>();
    }

    public ArrayList<Invitado> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Invitado> guests) {
        this.guests = guests;
    }


//    public ArrayList<Firework> getFireworks() {
//        return fireworks;
//    }
//
//    public void setFireworks(ArrayList<Firework> fireworks) {
//        this.fireworks = fireworks;
//    }

    public ArrayList<Explosive> getFireworks() {
        return fireworks;
    }

    public void setFireworks(ArrayList<Explosive> fireworks) {
        this.fireworks = fireworks;
    }

    public void serveCake() {

        System.out.println("Sirviendo la torta...");

        for (Invitado guest : guests) {
            guest.eatCake();
        }
    }

    //    public void lightFireworks() {
//
//        for (Firework fw : fireworks) {
//            fw.explode();
//        }
//    }
    public void lightFireworks() {

        for (Explosive fw : fireworks) {
            fw.explode();
        }
    }

    //    public void addFirework(Firework firework) {
//        fireworks.add(firework);
//        System.out.println("Fuego artificial añadido");
//    }
    public void addFirework(Explosive firework) {
        fireworks.add(firework);
        System.out.println("Fuego artificial añadido");
    }
}
