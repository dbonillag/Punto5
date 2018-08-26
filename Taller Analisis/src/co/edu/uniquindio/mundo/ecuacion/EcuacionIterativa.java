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
public class EcuacionIterativa {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		

		System.out.println(sumarPotencias(10));
		
	}
	
	
	public static double sumarPotencias(int n){
		
		double resul=0;
		
		for (; n > 0; n--) {
			
			resul+=Math.pow(n, 2);
			
		}
		
		return resul;
		
		
	}

}
