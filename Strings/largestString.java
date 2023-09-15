public class largestString{
	public static void main(String[] args){
		String str[] = {"Tony Stark", "Steve Rogers", "Bruce Wyne", "Matt Murdok", "Peter Parker"};
		String largest = str[0];
		for (int i = 0; i<str.length; i++) {
			if (largest.compareTo(str[i])<0) {
				largest = str[i];
			}
		}
		System.out.println(largest);

	}
}