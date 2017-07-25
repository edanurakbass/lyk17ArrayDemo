package tr.org.kamp.linux.exercises;

public class Exercises5String {

	public static void main(String[] args) {
		String d1 = "Edirne";
		String d2 = "Ankara";
		String d3 = "Tekirdag";
		String d4 = "ANKARA";
		String d5 = "Edirne";
		
		System.out.println(d1 + "-" + d3 + "=" + d1.equals(d3));
		System.out.println(d4 + "-" + d2 + "=" + d4.equalsIgnoreCase(d2));
	}

}
