/**
 * 
 */
package Ejercicios;

import java.util.Random;

/**
 * @author alicia
 *
 */
public class Ejercicio_19 {

	/**
	 * @param args
	 * Dado un numero k natural mayor a 10 mostrar todos los numeros primos que le
	 * anteceden. Por ejemplo si k=12 la salida sera {2,3,5,7,11}
	 */
	public static void main(String[] args) {
		int k;
				
		Random rdm = new Random();
		k = rdm.nextInt(150-10+1)+10;
		System.out.println ("Número: " + k);
	
		for(int i=2;i<k;i++){
            if(esprimo(i)==1)
                System.out.println(i);
        }
		
	}

    public static int esprimo(int k){
        int divisor=2;

        while(divisor<=(int)(k/2) && k%divisor!=0)
            divisor++;
        
        if(k%divisor==0 && k!=2)
            return 0;
        else return 1;

	}

}
