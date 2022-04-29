/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author alicia
 *
 */
public class Ejercicio_8 {

	/*
	 * Calcular la cantidad de minutos que hay existen en una cantidad de segundos ingresada
	 * por el usuario.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int segundosUsuario;
		int minutos;
		int segundos;
		
		System.out.print("Ingrese cantidad de segundos: ");
		segundosUsuario = scanner.nextInt();
		minutos = segundosUsuario / 60;
		segundos = segundosUsuario % 60;
		
		System.out.println(segundosUsuario + " segundos equivalen a " + minutos + " minutos con " + segundos + " segundos");
		
		scanner.close();
	}
	
}
