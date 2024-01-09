package ejercicio2;

public class Main {
	public static void main(String[] args) {
		// Instanciamos la clase Cajero
		Cajero cajero = new Cajero();
		// Invocamos el método crear cuenta
		cajero.crearCuenta("Gabriel Benítez","1234", "2020", 500);
		cajero.crearCuenta("Eduardo Franco","5678", "0987", 500);
		cajero.crearCuenta("Mario Cano","3448", "0564", 1);

		// Invocamos el método iniciarCajero para poner en marcha.
		cajero.iniciarCajero();
	}
}