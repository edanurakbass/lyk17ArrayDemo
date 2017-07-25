package tr.org.kamp.linux.exercises;

import java.util.Random;

public class Exercises3 {

	public static void main(String[] args) {
			Random rnd = new Random();
			//zar 3 kere atilacak
			for (int i = 0; i < 3; i++) {
				int dice1 = rnd.nextInt(6);
						dice1+=1;
				//1 ekleme sebebi zar o deger alamaz
				
				int dice2 = rnd.nextInt(6);
						dice2+=1;
						
						System.out.print("zarda gelen sayilar :");
						System.out.println(dice1 + "-" + dice2);
			}

	}

}
