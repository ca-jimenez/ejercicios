public class Contador {

    private int value;

    public Contador(int value) {
        this.value = value;
    }

    public Contador() {
    }

    public Contador(Contador counter) {
        this.value = counter.getValue();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addOne() {
        this.value++;
    }

    public void substractOne() {
        this.value--;
    }
}
