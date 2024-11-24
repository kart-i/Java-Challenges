package StringRelatedChallenges;

public class ReverseString {
	
	
	
	public void reverseString(String input) {
		
		StringBuilder inputString = new StringBuilder(input);
		System.out.println(inputString.reverse());
		
	}

	public static void main(String[] args) {
		
		ReverseString obj = new  ReverseString();
		
	}

}
