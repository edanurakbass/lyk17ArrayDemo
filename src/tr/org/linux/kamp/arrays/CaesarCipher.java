package tr.org.linux.kamp.arrays;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("lutfen bir anahtar giriniz:");
			int key = input.nextInt();
			input.nextLine();
			
			System.out.println("lutfen mesaji giriniz: ");
			String msg = input.nextLine();
			//bosluklari aldigimiz icin line
			
			System.out.println("sifreleme icin E,cozumleme icin D griniz:");
			String op =input.next();
			
			if(op.equals("E")) {
				System.out.println(encrypt(msg, key));
				
			}
			else if(op.equals("D")){
				System.out.println(decrypt(msg, key));
				
			}
			else {
				System.out.println("hatali bir operasyon sectiniz");
			}
				
	}
	
	public static String encrypt(String msg,int key) {
		if(key<0)key =26-(-key%26);
		String result ="";
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					result += (char)( 'A' + (ch + key -'A')%26);
				}
				else {
					result += (char) ('a' +(ch + key - 'a')%26);
					
				}
				
			}
			else {
				result += ch;
			
		}
	}
		return result;
}

	public static String decrypt(String msg,int key) {
		return encrypt(msg, -key);
	}

}
