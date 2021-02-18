import java.util.Scanner;
public class strFunctions {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str2 = s.nextLine();
		System.out.println("Concat " +str.concat(str2));
		System.out.println(str2.concat(str));
		System.out.println("Length: " +str.length());
		System.out.println("INdex: "+str.indexOf('a'));
		System.out.println("CharAt: "+str.charAt(5));
		System.out.println("Comp: "+str.compareTo(str2));
		System.out.println("Comp ignorecase"+str.compareToIgnoreCase("ROCKSTAR"));
		System.out.println("Contains: "+ str.contains("Sta"));
		System.out.println("Contains2: "+ str2.contains("Sta"));
		System.out.println("End r: "+str.endsWith("r"));
		System.out.println("End ar: "+str.endsWith("ar"));
		System.out.println("Replace: "+str.replace("star"," Johnson"));
		System.out.println("upper lower: "+str2.toUpperCase()+str2.toLowerCase());
		
	}
}
