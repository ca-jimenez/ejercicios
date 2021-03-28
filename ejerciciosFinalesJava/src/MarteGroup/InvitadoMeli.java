package MarteGroup;

public class InvitadoMeli extends Invitado{

    public InvitadoMeli(String name) {
        super(name);
    }

    @Override
    public void eatCake() {
        System.out.println(this.getName() + " está comiendo");
        System.out.println("Viva la Chiqui!!");
    }
}
