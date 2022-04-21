/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_14 {

	/*
	 *Dado un numero natural N se desea conocer sus divisores y la suma de todos ellos. No
	 *considerar el 1 si mismo 
	 */
	public static void main(String[] args) {
		
		int n;
		int acumulador = 0;
		int divisor = 2;
		Random rdm = new Random ();
		
		n = rdm.nextInt(50);
		System.out.println("Numero: " + n);
		
		while(divisor<=n/2) {
			if(n%divisor==0) {
				System.out.println("Divisor: " + divisor);
				acumulador = acumulador+divisor;
			}
			
			divisor++;
		}
		System.out.println("La suma de los divisores da: " + acumulador);

	}

}
