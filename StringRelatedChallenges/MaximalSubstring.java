package StringRelatedChallenges;

public class MaximalSubstring {
	
	public int maximalString(String inputString) {

		if(inputString == null || inputString.isEmpty()) {

			return 0;

		}

		String[] splittedStringsArray = inputString.trim().split("\\s+");
		int maximalStringPosition = (splittedStringsArray.length)-1;


		return splittedStringsArray[maximalStringPosition].length(); 


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
