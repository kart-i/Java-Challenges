package StringRelatedChallenges;

public class ReverseTheNumber {
	
	public int reverseTheNumber(int inputNumber) {

		int inputValue = inputNumber;
		int reverseNumber = 0;

		while (inputValue!=0) { 

			if(reverseNumber<Integer.MIN_VALUE/10 || reverseNumber>Integer.MAX_VALUE/10) {

				return 0;	

			}
			reverseNumber = reverseNumber*10 + (inputValue%10);
			inputValue= inputValue/10;

		}	
		return reverseNumber;

	}

	public static void main(String[] args) {
		

	}

}
