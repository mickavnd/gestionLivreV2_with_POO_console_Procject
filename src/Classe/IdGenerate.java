package Classe;

import java.time.Year;

public class IdGenerate {
	
	private static  int  compteur =0;
	
	public static String generateId() {
		
		 compteur++;
		 String prefix = "etu";
		 int years = Year.now().getValue();
		 String number = String.format("%05d",compteur);
		 
		 return prefix+ "-"+years+"-"+number;
	}
	
}
