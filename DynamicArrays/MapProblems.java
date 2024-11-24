package DynamicArrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapProblems {


	public boolean canConstruct(String ransomNote, String magazine){

		Map<Character,Integer> magazineMap = new HashMap<Character,Integer>();

		for(char value : magazine.toCharArray()) {

			magazineMap.put(value, magazineMap.getOrDefault(value, 0)+1);

		}

		for(char value : ransomNote.toCharArray()) {

			if(!magazineMap.containsKey(value) || magazineMap.get(value) ==0) {
				
				return false;
			}
			
			magazineMap.put(value, magazineMap.get(value)-1);
		}

		return true;

	}

	public boolean uniqueOccurrences(int[] arr){
		
		Map<Integer,Integer> occurences = new HashMap<Integer,Integer>();
		
		for(int value : arr) {
			
			occurences.put(value, occurences.getOrDefault(value, 0)+1);
			
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int value : occurences.values()) {
			
			if(!set.add(value)) {
				
				return false;
			}
				
		 }
		 return true;
		
	 }
	
	


	public static void main(String[] args) {
					
	}

}
