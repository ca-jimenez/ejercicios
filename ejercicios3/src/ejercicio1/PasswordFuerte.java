package ejercicio1;

public class PasswordFuerte extends Password {


    public PasswordFuerte() {
        setPattern("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[._-])[a-zA-Z0-9_.-]{12,20}$");
    }

    public PasswordFuerte(String regex) {
        super(regex);

    }
}
