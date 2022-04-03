package sampletTest;

public class myFirstProject {

	public static void main(String[] args) {
		
		String s1 = "Nagaraju";
		String s2 = "Ankamreddi";
		
		System.out.println(s1+ " " + s2);
		System.out.println(s1.charAt(4));
		System.out.println((s1.endsWith("i")));
		System.out.println(s2.startsWith("A"));
		System.out.println(s2.contains("Ankam"));
		System.out.println(s2.equalsIgnoreCase("Ankamreddi"));
		System.out.println(s1.compareTo("Naga"));
		System.out.println(s1.concat(" ".concat(s2)));
		
	}

}

