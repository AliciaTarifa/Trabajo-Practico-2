/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

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
		
		int a;
		int b;
		int c;
		
		Scanner leer =new Scanner(System.in);
		System.out.print("Ingresar el 1� lado:");
		a =leer.nextInt();
		System.out.print("Ingresar el 2� lado:");
		b =leer.nextInt();
		System.out.print("Ingresar el 3� lado:");
		c =leer.nextInt();
		
		System.out.println("Los lados del tri�ngulo son " + a + ", " + b + ", " + c);
		
		if(a==b && b==c) {
			System.out.print("El tri�ngulo es Equilatero");
		}
		else {
			if(a==b || a==c || b==c) {
				System.out.print("El tri�ngulo es Is�sceles");
			} else {
				System.out.println("El tri�ngulo es Escaleno");
			}
		}
		
		
		leer.close();
	}

}
