/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_18 {

	/**
	 * @param args
	 * Dado un numero natural K determinar si es capicua.

	 */
	public static void main(String[] args) {
		int k;
		int inverso =0;
		int aux;
		
		Random rdm = new Random();
		k = rdm.nextInt(2000);
		System.out.print("Número: " + k);
		System.out.println("");
		aux = k;
		while (aux!=0) {
			inverso = inverso*10 + (aux%10);
			aux=aux/10;
		}	
			if (k==inverso){
				System.out.println("El número: " + k + " es capicua");
			} else {
				System.out.println("El número: " + k + " no es capicua");
			}
			
		
		
		
		

	}

}
