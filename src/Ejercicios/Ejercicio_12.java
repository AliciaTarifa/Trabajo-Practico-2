/**
 * 
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * @author alicia
 *
 */
public class Ejercicio_12 {

	/*
	 * Dada un lista con las edades de N deportistas, se necesita informar la edad promedio de
	 * los deportistas de la lista; cual es la menor y la mayor edad ingresada.
	 */
	public static void main(String[] args) {
		
		int edad;
		int n;
		int promedio = 0;
		int mayor = 0;
		int menor = -1;
		
		Scanner leer = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("Ingresar la cantidad de deportistas: ");
		n = leer.nextInt();
		for(int i=0; i<n;i++) {
			//System.out.print("Ingrese el "+i+"° Edad:");
			//edad=leer.nextInt();
			edad=rnd.nextInt(35 - 18 +1)+18;
			System.out.println(edad);
			promedio=promedio+edad;
			if(i==0) {
				menor=edad;
				mayor=edad;
			}
			else {
				if(edad>mayor)
					mayor=edad;
				else if (edad<menor) {
					menor=edad;
				}
			}
			
		}
		System.out.println("Promedio de Edades:"+promedio/n);
		System.out.println("Mayor edad ingresada:"+mayor);
		System.out.println("Menor edad ingresada:"+menor);


	}

}
