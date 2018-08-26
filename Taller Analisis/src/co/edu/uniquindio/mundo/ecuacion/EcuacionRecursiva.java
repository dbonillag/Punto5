/**
 * 
 */
package co.edu.uniquindio.mundo.ecuacion;

/**
 * Descripción:
 * @author Daniel Bonilla
 * @since 26/08/2018
 * @version 1.0
 */
public class EcuacionRecursiva {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sumarPotencias(10));

	}
	
	
	
	public static double sumarPotencias(int n) {		
		if (n==1) {
			return 1;
		}	
		return Math.pow(n, 2)+sumarPotencias(n-1);	
	}

}
