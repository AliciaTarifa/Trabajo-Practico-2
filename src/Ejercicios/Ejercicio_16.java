/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_16 {

	/*
	 *Dado un numero natural n mostrar sus digitos indivudualmente.
 
	 */
	public static void main(String[] args) {
		int n;
		int digito;
		
		Random rdm = new Random();
		
		n = rdm.nextInt(150);
		System.out.println("Número: " + n);
		
		while (n!=0) {
			digito = n%10;
			System.out.println(digito);
			n = n/10;
		}
		
	}
	

}
