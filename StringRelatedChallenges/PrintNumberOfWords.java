package StringRelatedChallenges;

public class PrintNumberOfWords {
	
	public int printNumberOfWords(String input) {

		if(input.equals("") || input == null) {

			return 0;

		}
		String[] array = input.split(" ");
		return array.length;

	}




	public static void main(String[] args) {


	}

}
