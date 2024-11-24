package StringRelatedChallenges;

public class RemoveCharacter {


	public String removeChar(String stringInput,char charInput) {

		if(stringInput.equals("") || stringInput==null) {

			return "Empty String";

		}

		StringBuilder newString = new StringBuilder();
		for(char character : stringInput.toCharArray()) {

			if(character!=charInput) {

				newString.append(character);
			}

		}
		return newString.toString();



	}

	public static void main(String[] args) {
		

	}

}
