/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_11 {

	/*
	 * Dado 3 numeros naturales que representan los lados de un triángulo, se pide determinar
	 * si el triángulo es Isosceles, Escaleno o Equilatero.
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int a = rnd.nextInt(10)+1;
		int b = rnd.nextInt(10)+1;
		int c = rnd.nextInt(10)+1;
		System.out.println("Los lados del triángulo son " + a + ", " + b + ", " + c);
		
		if (a==b && b==c) {
			System.out.println("El triiángulo es equilatero");
		}
		if ((a!=b && b==c)|| (a==b && b!=c)) {
			System.out.println("El triángulo es isóceles");
		}
		if (a!=b && b!=c) {
			System.out.println("El triángulo es escaleno");
		}
		
		
		
	}

}
