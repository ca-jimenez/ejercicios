package MarteGroup;

public class InvitadoStandard extends Invitado{

    public InvitadoStandard(String name) {
        super(name);
    }

    @Override
    public void eatCake() {
        System.out.println(this.getName() + " está comiendo");
    }
}
