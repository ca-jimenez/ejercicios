package ejercicio1;

public class PasswordSimple extends Password {


    public PasswordSimple() {
        setPattern("^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_.-]{8,12}$");
    }

    public PasswordSimple(String regex) {
        super(regex);

    }
}
