package tr.org.kamp.linux.exercises;

import java.util.Random;

public class Exercises1 {

	public static void main(String[] args) {
			
			int dizi[] = new int [6];
			Random rnd = new Random();
			
			for (int i = 0; i < dizi.length; i++) {
			   dizi[i] = rnd.nextInt();
				System.out.println("dizinin " + (i+1) + ".elemani = " + dizi[i]);
				
			}
			
			
	}

}
