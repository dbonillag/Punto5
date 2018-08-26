/**
 * 
 */
package co.edu.uniquindio.mundo.palindromos;

import java.util.ArrayList;

/**
 * Descripción:
 * @author Daniel Bonilla
 * @since 25/08/2018
 * @version 1.0
 */
public class PalidromoIterativo {
	
	
	public static void main(String[] args) {
		
		ArrayList<String>  palindromos=devolverPalindromos("vieina");
		
		System.out.println(palindromos.toString());
	}
	
	public static ArrayList<String> devolverPalindromos(String palabra){
		
		ArrayList<String> palindromos=new ArrayList<>();
		
		int i;
		
		for (int etapa = 0; etapa < palabra.length(); etapa++) {
			for (i=0; i+etapa<palabra.length(); i++) {
				
				if (esPalindromo(palabra, i, i+etapa)) {
					palindromos.add(palabra.substring(i, i+etapa+1));
				}
				
			}
		}
		
		return palindromos;
		
		
		
	}
	
	
	public static boolean esPalindromo(String palabra,int i,int j){		
		
	
		
		palabra=palabra.toLowerCase();
		for (; i<j ; i++,j--) {
			
			if (palabra.charAt(i)!=palabra.charAt(j)) {
				
				return false;
			}
		}
		
		return true;	
	}

}
