public class CuentaAhorros extends CuentaBancaria implements ICuentaAhorros {


    public CuentaAhorros(int numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }


    @Override
    public double calcularInteresMensual(double tasaInteres) {
        double interesMensual= tasaInteres*getSaldo();
        return interesMensual;
    }
}
