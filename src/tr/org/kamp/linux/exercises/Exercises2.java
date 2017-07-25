package tr.org.kamp.linux.exercises;

import java.util.Random;

public class Exercises2 {

	public static void main(String[] args) {
			int number = 6, value = 1;
			Random rgen = new Random();
			
			while(true) {
				int a = rgen.nextInt(14);
				//reandomun urettigi sayi 0-14 arasinda olacak.
				if(a != number) {
					value++;
					
				}
				else {
					System.out.println("sayi" + value + ".deneme de bulundu");
				break;
			}
	}
	}
}
