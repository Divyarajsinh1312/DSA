import java.util.*;
public class basic{
	public static void stringIteration(String str){
		for (int i = 0; i<str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		char String[] = {'a','b','c'};
		String str = "abcd";
		String str2 = new String("XYZ");

		//Strings are IMMUTABLE

		Scanner scn = new Scanner(System.in);
		String name;
		name = scn.next();
		System.out.println(name);

		//String Length
		int length = name.length();
		System.out.println("Length of the String is " + length);

		//String Concatenation
		String firstName = "Tony";
		String lastName = "Stark";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);

		//charAt
		String avengers = "Steve Rogers";
		System.out.println("Char at 1st index is '" + avengers.charAt(1) + "' of string 'Steve Rogers'");

		//String Iteration
		stringIteration(avengers);

	}
}