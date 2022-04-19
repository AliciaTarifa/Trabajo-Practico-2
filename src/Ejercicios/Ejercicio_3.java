/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_3 {

	/*
	 * Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor 
	 * y el menor.
	 */
	public static void main(String[] args) {
		
		int num1 = 489;
		int num2 = 625;
		int num3 = 354;
		
		int mayor = num1;
		
		if (num1 < num2) {
			mayor = num2;
		}
		
		if (num2 < num3) {
			mayor = num3;
		}
		
		System.out.println("El mayor entre " + num1 + " " + num2  + " y " + num3 + " es: " + mayor);
		
		int menor = num1;
		
		if (num1 > num2) {
			menor = num2;
		}
		if (num2 > num3) {
			menor = num3;
		}
		System.out.println("El menor entre " + num1 + " " + num2  + " y " + num3 + " es: " + menor);

	}

}
