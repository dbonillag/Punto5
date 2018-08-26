/**
 * 
 */
package co.edu.uniquindio.mundo.palindromos;

import java.util.ArrayList;

/**
 * Descripción:
 * 
 * @author Daniel Bonilla
 * @since 25/08/2018
 * @version 1.0
 */
public class PalindromoRecursivo {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String>  palindromos=new ArrayList<>();

		devolverPalindromosRec(palindromos, "vieina", 0, 0);
		

		System.out.println(palindromos.toString());

	}
	
	public static void devolverPalindromosRec(ArrayList<String> palindromos, String palabra, int i,int etapa) {
		
		
		if (etapa!=palabra.length()) {
			
			if (i+etapa==palabra.length()) {
				devolverPalindromosRec(palindromos, palabra, 0, etapa+1);
			}else {
				
				if (esPalindromo(palabra.toLowerCase(), i, i+etapa)) {
					palindromos.add(palabra.substring(i, i+etapa+1));
				}
				
				devolverPalindromosRec(palindromos, palabra, i+1, etapa);
				
			}
			
			
			
		}
		
		
	}

	public static boolean esPalindromo(String palabra, int i, int j) {
	

		if(i>=j) {
			return  true;
		}else {
			
			if (palabra.charAt(i)!=palabra.charAt(j)) {
				return false;
			}
			
			return esPalindromo(palabra, i+1, j-1);
			
			
		}
			
			
			
		}
		
}
