// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        {

            /*
            La cuenta bancaria puede tener diferentes tipos de cuentas y estas se comportan de forma diferente
             */

            CuentaBancaria c1 = new CuentaAhorros(12345,"Arturo",5000);
            c1.retirar(200);
            c1.retirar(500);
            c1.depositar(10000);
            System.out.println("Interes mensual: " +c1.calcularInteresMensual(0.02));
            System.out.println(c1.getSaldo());

        }
    }
}