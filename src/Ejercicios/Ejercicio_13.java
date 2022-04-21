/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_13 {

	/*
	 * Dado un natural K. Generar y mostrar todos los numeros enteros pares comprendidos en
	 * el intervalo [-K,K]. Considerar K mayor que 1.
	 */
	public static void main(String[] args) {
		
		int k;
		k = 15;
		System.out.println("Los números pares dentro del rango (" + -k +", " + k + ") son: ");
		
		for(int i= - k;i<k;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		

	}

}
