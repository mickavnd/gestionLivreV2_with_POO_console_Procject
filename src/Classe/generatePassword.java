package Classe;

import java.security.SecureRandom;

public class generatePassword {
	
	public static final String CHARARACTERS ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	+"abcdefghijklmnopqrstuvwxyz"
	+"0123456789"
	+"!@#$%^&*()-=+";

	private static final SecureRandom random = new SecureRandom();
	
	public static String generate(int length) {
		
		StringBuilder password = new StringBuilder();
		
		for(int i = 0; i<length;i++) {
			int index  = random.nextInt(CHARARACTERS.length());
			password.append(CHARARACTERS.charAt(index));
		}
		return password.toString();
	}
	
}
