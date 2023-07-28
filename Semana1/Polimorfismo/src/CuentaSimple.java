public class CuentaSimple extends CuentaBancaria{

    public CuentaSimple(int numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteresMensual(double tasaInteres) {
        return 0;
    }


}
