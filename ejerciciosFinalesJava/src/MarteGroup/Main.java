package MarteGroup;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        InvitadoMeli invitado1 = new InvitadoMeli("Marcos");
        InvitadoMeli invitado2 = new InvitadoMeli("Marcela");
        InvitadoMeli invitado3 = new InvitadoMeli("Agustina");
        InvitadoStandard invitado4 = new InvitadoStandard("Adrian");
        InvitadoStandard invitado5 = new InvitadoStandard("Veronica");
        InvitadoStandard invitado6 = new InvitadoStandard("Sofia");

        ArrayList<Invitado> invitados = new ArrayList<>();

        invitados.add(invitado1);
        invitados.add(invitado2);
        invitados.add(invitado3);
        invitados.add(invitado4);
        invitados.add(invitado5);
        invitados.add(invitado6);

        FireworkIndividual fwk1 = new FireworkIndividual("petardo");
        FireworkIndividual fwk2 = new FireworkIndividual("bengala");
        FireworkIndividual fwk3 = new FireworkIndividual("caña voladora");
        FireworkIndividual fwk4 = new FireworkIndividual("bateria");

        ArrayList<Firework> fArtificiales = new ArrayList<>();

        fArtificiales.add(fwk1);
        fArtificiales.add(fwk2);
        fArtificiales.add(fwk3);
        fArtificiales.add(fwk4);

        FireworkPack pack1 = new FireworkPack();
        pack1.addFirework(fwk1);
        pack1.addFirework(fwk2);

        FireworkPack pack2 = new FireworkPack();
        pack2.addFirework(fwk1);
        pack2.addFirework(fwk2);
        pack2.addFirework(fwk3);
        pack2.addFirework(fwk4);
        pack2.addFirework(pack1);

        fArtificiales.add(pack2);

        Evento evento = new Evento(invitados, fArtificiales);

        ArrayList<Firework> fuegos = evento.getFireworks();

        for (Firework fuego: fuegos) {

            System.out.println(fuego);
        }

        ArrayList<Invitado> inv = evento.getGuests();

        for (Invitado invitado : inv) {
            System.out.println(invitado);
        }

        System.out.println("-------");
        evento.serveCake();

        System.out.println("-------");
        evento.lightFireworks();
    }
}
