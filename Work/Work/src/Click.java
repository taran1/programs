
public class Click {
	public static void main (String[] arguments){
		String str = "Warszawa jest stolic¹ Polski.";
		System.out.println("Tekst to: " + str);
		System.out.println("D³ugoœæ tekstu: "
		+ str.length());
		System.out.println("Znak na pozycji 6.: "
		+ str.charAt(6));
		System.out.println("Fragment od znaku 10. do 18.:"
		+ str.substring(10, 18));
		System.out.println("Indeks pierwszej litery 'r':"
		+str.indexOf('r'));
		System.out.println("Indeks pocz¹tku podtekstu:)"
				+ "\"jest\"" + str.indexOf("jest"));
		System.out.println("Tekst zapisany wielkimi literami: "
				+ str.toUpperCase());
	
	}

}
