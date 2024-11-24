package StringRelatedChallenges;

public class CheckPalindrome {
	
	public boolean checkPalindrome(String inputString) {
		
		if(inputString == null || inputString.isEmpty()) {
			
			return true;
			
		}
		
		String modifiedString = inputString.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		int left = 0;
		int right = modifiedString.length()-1;
		
		while(left<right) {
			
			if (modifiedString.charAt(left) != modifiedString.charAt(right)) {
				
				return false;
				
			}	
			left++;
			right--;
		}
		return true;	
	}
	
	public static void main(String[] args) {
		

	}

}
