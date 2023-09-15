public class stringFunctions{
	public static void main(String[] args) {
		String s1 = "Tony";//S1 and S2 are equal becuase s2 point s1 string.
		String s2 = "Tony";
		String s3 = new String("Tony");//But here using new we make new string which is different

		//Here we compare string at Object Level.
		if (s1==s2) {
			System.out.println("S1 and S2 are equal.");
		}else{
			System.out.println("S1 and S2 are not equal.");
		}

		if (s1==s3) {
			System.out.println("S1 and S3 are equal.");
		}else{
			System.out.println("S1 and S3 are not equal");
		}

		//Here we compare string with value.
		if (s1.equals(s3)) {
			System.out.println("S1 and S3 are equal.");
		}else{
			System.out.println("S1 and S2 ar not equal.");
		}

		//Substring Function
		String str = "HelloJAVA";
		System.out.println("Substring of " + str + " is " + str.substring(0,5));

		//Largest String
		String string[] = {"Tony Stark", "Steve Rogers", "Bruce Wyne", "Matt Murdok", "Peter Parker"};
		String largest = str[0];
		for (int i = 0; i<string.length; i++) {
			if (largest.compareTo(string[i])<0) {
				largest = string[i];
			}
		}
		System.out.println(largest); 

	}
}