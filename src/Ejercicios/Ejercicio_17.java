/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_17 {

	/**
	 * @param args
	 * Dada un lista de numero naturales mostrar aquellos que tengan una cantidad par de
	 * digitos pares
	 */
	public static void main(String[] args) {	
		int numList;
		int aux;
		int cantDigitosPares = 0;
		
		for(int i=0;i<10;i++){
			Random rdm= new Random();
			numList= rdm.nextInt(50);
        	aux=numList;
			System.out.println("Numero: "+numList);
			while(numList>0) {
				if((numList%10)%2==0)
                	cantDigitosPares++;
				numList=numList/10;
			}
			if (cantDigitosPares%2==0) {
				System.out.println("El numero "+aux+" tiene una cantidad par de digitos pares");
			} else {
				System.out.println("El numero "+aux+" no tiene una cantidad par de digitos pares");
			}
		}
	}
}
