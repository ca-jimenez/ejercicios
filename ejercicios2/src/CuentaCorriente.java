public class CuentaCorriente {

    private String numeroCuenta;
    private double saldo;

    public CuentaCorriente(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente() {
    }

    public CuentaCorriente(CuentaCorriente cuenta) {
        this.numeroCuenta = cuenta.getNumeroCuenta();
        this.saldo = cuenta.getSaldo();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void ingreso(double v) {
        setSaldo(saldo + v);
    }

    public void egreso(double v) {
        setSaldo(saldo - v);
    }

    public void reintegro() {

    }

    public void transferencia(double monto, CuentaCorriente destino) {

        this.egreso(monto);
        destino.ingreso(monto);
    }
}
