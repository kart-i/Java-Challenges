package StringRelatedChallenges;

import java.util.Arrays;

public class RearrangeSentence {
	
	
	public String rearrange(String shuffledSentence ) {
		
		String[] arr = shuffledSentence.split(" ");
		String[] resultArray = new String[arr.length];
				
		for(String word:arr) {		
			int	index = Character.getNumericValue(word.charAt(word.length()-1))-1;
			String str = word.replaceAll("[^a-zA-Z]", "");	
			resultArray[index] = str;			
		}
		StringBuilder sb = new StringBuilder();
		
		for(String value: resultArray) {
			sb.append(value +" ");
		}
		return sb.toString().trim();
		
	}

	public static void main(String[] args) {
		
		RearrangeSentence obj = new RearrangeSentence();
		String result = obj.rearrange("karthi3 is2 phone4 this1");
		
		System.out.println(result);
		

	}

}
