package Ejercicio3;
/*
En el método sacarDinero: Cambiar código de error por excepcion 'ExceptionSaldoInsuficiente'
 */
public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public int sacarDinero(double cantidad) {
        if (cantidad > saldo) {
        	 new ExcepcionSaldoInsuficiente("Saldo insuficiente");
        }  else { saldo -= cantidad;}
		return 0;
    }
}
