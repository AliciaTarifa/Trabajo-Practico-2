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
	 * Dado 3 numeros naturales que representan los lados de un tri�ngulo, se pide determinar
	 * si el tri�ngulo es Isosceles, Escaleno o Equilatero.
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int a = rnd.nextInt(10)+1;
		int b = rnd.nextInt(10)+1;
		int c = rnd.nextInt(10)+1;
		System.out.println("Los lados del tri�ngulo son " + a + ", " + b + ", " + c);
		
		if (a==b && b==c) {
			System.out.println("El trii�ngulo es equilatero");
		}
		if ((a!=b && b==c)|| (a==b && b!=c)) {
			System.out.println("El tri�ngulo es is�celes");
		}
		if (a!=b && b!=c) {
			System.out.println("El tri�ngulo es escaleno");
		}
		
		
		
	}

}
