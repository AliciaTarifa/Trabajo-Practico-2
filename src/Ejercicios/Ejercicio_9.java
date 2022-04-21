/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_9 {

	/*
	 * Dados tres números, mostrarlos ordenados ascendentemente
	 */
	public static void main(String[] args) {
		
		int num1;
		float num2;
		double num3;
		
		Random random = new Random();
		
		num1 = random.nextInt();
		num2 = random.nextFloat();
		num3 = random.nextDouble();
		
		if (num1>num2) {
			if(num2>num3) {
				System.out.println(num3 + " ; " + num2 + " ; " + num1);
			} else {
				if(num1>num3){
					System.out.println(num2 + " ; " + num3 + " ; " + num1);
			    } 
			}
	    } else {
	    	if(num3>num1){
	    		System.out.println(num1 + " ; " + num2 + " ; " + num3);
		    } else {
		    	System.out.println(num3 + " ; " + num1 + " ; " + num2);
			}
	    }
	}

}
