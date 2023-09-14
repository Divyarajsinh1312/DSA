import java.util.*;
public class palindrome{
	public static int palindromeString(String str){
		for (int i =0 ; i<str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str;
		str = scn.next();
		int result = palindromeString(str);
		if (result == 1) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}
}