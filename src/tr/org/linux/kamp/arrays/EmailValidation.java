package tr.org.linux.kamp.arrays;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		//bosluk icermemeli
		//@ karakteri bulundurmali
		//'.' karakteri bulundurmali
		//@ veya '.' karakter olmamali
		//@ ile ;.; arasinda en az 1 karakter olmali
		//'.' dan sonra en az 2 karakter olmali
		
		Scanner input = new Scanner(System.in);
		String mail = input.next();
		System.out.println();
		
	      
	
	}
   public static boolean isEmailValid(String str) {
	   if(str.contains(" ")) {
		   return false;
	   }
	  
	   if(!str.contains("@")) {
		   return false;
	   }
	  
	   if(!str.contains(".")) {
		   return false;
	   }
	   
	   if(str.startsWith("@") || str.startsWith(".")) {
		   return false;
	   }
	   
	  // if(str.indexOf(".")<1 - str.indexOf("@"))
		   if(str.contains("@.")) {
			   return false;
		   
	   }
		   
		    if(str.length() - str.lastIndexOf(".") <=2) {
		    	return false;
		    }
			return false;
	
	
}
}
