/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_15 {

	/*
	 * Dado un numero natural N. Determinar si este es primo.
	 */
	public static void main(String[] args) {
		int n;
		
		int divisor = 2;
		Random rdm = new Random();
		
		n = rdm.nextInt(60);
		System.out.println("Numero:"+n);
		
		while(divisor<=n/2 && n%divisor!=0) {
			divisor++;
		}

        if(n%divisor==0) {
            System.out.println(n + " es un número primo");
        } else { 
        	System.out.println(n + " no es un número primo");
        }
		
	}

	
}


