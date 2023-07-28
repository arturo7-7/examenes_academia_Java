import java.math.BigDecimal;

public abstract class CuentaBancaria {

    private int numeroCuenta;
    private String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
        if(saldo >0) {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldo;
        }
    }


    public void depositar(double monto){
        saldo=saldo+monto;
    }


    /**
     *
     * @param monto
     * Validar que el monto a retirar no sea mayor que el saldo
     */
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }


    /**
     *
     * Comportamiento que tendran las hijad, comportandose diferente que el padre
     */
    public abstract double calcularInteresMensual( double tasaInteres);



}
