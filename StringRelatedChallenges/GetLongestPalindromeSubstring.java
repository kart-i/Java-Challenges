package StringRelatedChallenges;

public class GetLongestPalindromeSubstring {
	
	/* Solve using expand around the center technique
	 * */

	public String getLongestPalindromicSubstring(String inputString) {//baaba
		int start = 0;
		int end = 0;

		/* Palindrome may be of odd length or even length.
		 * So, find and compare both the length to find the maximum.
		 */
		for(int mid=0;mid<inputString.length();mid++) {
			// middle value for odd length palindrome will be one digit
			int oddPalindromeLength = getPalindromeLength(inputString,mid,mid);

			// middle value for even length palindrome will be two digit
			int evenPalindromeLength = getPalindromeLength(inputString,mid,mid+1);
			int palindromeLength = Math.max(oddPalindromeLength, evenPalindromeLength);

			/*	intially the first character is set as palindrome
	 		 *	find the new palindrome start and end.
			 */
			if(palindromeLength> end - start) {
				start = mid-(palindromeLength-1)/2;
				end = mid+palindromeLength/2;   
			}

		}
		return inputString.substring(start, end+1);
	}

	// expand from the centre to find the palindrome substring
	public int getPalindromeLength(String s, int left, int right){
		while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){	
			left--;
			right++;
		}
		return right-left-1;
	}
	
	public static void main(String[] args) {
		GetLongestPalindromeSubstring obj = new GetLongestPalindromeSubstring();
		System.out.println(obj.getLongestPalindromicSubstring("baaba"));

	}
	
}
