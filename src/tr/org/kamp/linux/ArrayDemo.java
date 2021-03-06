package tr.org.kamp.linux;


	import java.util.Random;

	public class ArrayDemo {
		private static Random rand = new Random();
		private static int bound =10;
		private static int[] array = new int[bound] ;  
		
		public static void main(String[] args) {
			generateArray();
			printArray();
			sortArray();
			
			System.out.println("sıralanmış dizi ");
			printArray();
			
			int item = 5;
			if(searchItem(item)) {
				System.out.println("\n"+item + " dizi içinde bulundu");
			}else {
				System.out.println("\n"+item + " elemanı bulunamadı");
			}
		}

		
		private static boolean searchItem(int item) {
			
			for(int i = 0 ; i < array.length ; i++) {
				if(array[i] == item) {
					return true;
				}
			}
			
			return false;
			
		}


		public static void generateArray() {
			int item;
			for(int i = 0 ; i < array.length ; i++) {
				item = rand.nextInt(10);
				array[i] = item;
			}
		}
		
		public static void printArray() {
			for(int i = 0 ; i < array.length ; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println("");
		}
		
		public static void sortArray() {
			
			int temp;
			for(int i = 0 ; i < array.length ; i++) {
				for(int j = 1 ; j < array.length ; j++) {
				
					if(array[j-1] > array[j]) {
						temp = array[j-1];
						array[j-1] = array[j];
						array[j] = temp; 
					}
				}
			}
		}

	}


