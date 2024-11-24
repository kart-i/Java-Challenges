package DynamicArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListProblems {
		
		
	public List<String> rotate(String[] str) {
		
		List<String> strList = Arrays.asList(str);
		
		Collections.rotate(strList, 1);
		
	
		
		System.out.println(strList);
		
		return strList;
		
		
	}
	
	public List<Character> findCommonCharacters(String[] words) {
	
	
		int [] minimumFrequency = new int[26];
		
		Arrays.fill(minimumFrequency, Integer.MAX_VALUE);
		
		for(String word : words) {
			
			int[] charFrequency = new int[26];
			
			for(char value: word.toCharArray()) {
				
				charFrequency[value-'a']++;
				
			}
			
			for(int i=0; i<charFrequency.length;i++) {
			
			minimumFrequency[i]	= Math.min(minimumFrequency[i], charFrequency[i]);
				
			}
			
			
		}
		
		
		List<Character> commonCharacters = new ArrayList<Character>();

		for(int i = 0; i<minimumFrequency.length; i++) {


			while(minimumFrequency[i]>0) {

				Character theCharacter =  (char)(i+'a');

				commonCharacters.add(theCharacter);
				minimumFrequency[i]--;

			}


		}

		return commonCharacters;

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
