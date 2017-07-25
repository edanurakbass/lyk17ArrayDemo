package tr.org.kamp.linux.exercises;

import java.util.Scanner;

public class Exercises4Email {

	 
				//bosluk icermemeli
				//@  bulundurmali
				//'.'  bulundurmali
				//@ veya '.' karakter olmamali
				//@ ile ;.; arasinda en az 1 karakter olmali
				//'.' dan sonra en az 2 karakter olmali
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("email adresinizi giriniz" );
		
		 String mail = input.next();
	  
		 if(isEmailValid(mail)) {
		    System.out.println("gecerli adres");
		 }
		 else {
		System.out.println("gecersiz adres");
		 }
	public static boolean isEmailValid (String str) {
		
		if(str.contains(" ")  || !str.contains(".") || !str.contains("@") || str.contains("@.")) {
			return false;
		}
		if ((str.charAt(0)=='@') || (str.charAt(0)=='.')){
			
			return false;
			if (str.length() -1 =='.' || str.length()-2 =='.') {
				return false;
				
				
			}
			
		}
		
	}

}
