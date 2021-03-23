package ejercicio1;

public class PasswordIntermedia extends Password {


    public PasswordIntermedia() {
        setPattern("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_.-]{10,20}$");
    }

    public PasswordIntermedia(String regex) {
        super(regex);

    }
}
