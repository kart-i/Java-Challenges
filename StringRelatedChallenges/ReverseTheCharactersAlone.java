package StringRelatedChallenges;

public class ReverseTheCharactersAlone {
	
public String reverseTheCharactersAlone(String input) { //ab-cd
		
		char[] array = input.toCharArray();
		
		int left = 0;
		int right = array.length-1;
		
		while(left<right) {
			
			while(left<right && !Character.isLetter(array[left])) {
				
				left++;
				
			}
			while(left<right && !Character.isLetter(array[right])) {
				
				right--;
				
			}
			
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			
			left++;
			right--;
			
		 }
		 return new String(array);	
			
	 }
	
	
	
	

	public static void main(String[] args) {
		

	}

}
