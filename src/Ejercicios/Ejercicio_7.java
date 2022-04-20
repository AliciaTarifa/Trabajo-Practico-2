/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_7 {
	/*
	 * Declare dos variables de tipo entero una con el nombre divisor y la otra dividendo. Asigne
	 * a dividendo el valor 25 y a la variable divisor el valor 10. muestre el resto (%) de la division
	 * entre dividendo y divisor. Luego a dividendo asigne el valor 25/10. Y vuelva a mostrar el
	 * resto entre dividendo y divisor.
	 */
	public static void main(String[] args) {
		int divisor;
		int dividendo;
		
		dividendo = 25;
		divisor = 10;
		System.out.println(dividendo%divisor);
		
		dividendo = dividendo/divisor;
		System.out.println(dividendo%divisor);

	}

}
