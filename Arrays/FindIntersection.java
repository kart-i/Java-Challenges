package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	
	public Set<Integer> findIntersection(int[] array1, int[] array2){
		
		Set<Integer> copyOfArray1 = new HashSet<Integer>();
		Set<Integer> copyOfArray2 = new HashSet<Integer>();
		
		for(int value : array1) {
			
			copyOfArray1.add(value);
			
		}
		
		for(int value : array2) {
			
			copyOfArray2.add(value);
					
		}
		
		copyOfArray1.retainAll(copyOfArray2);
		return copyOfArray1;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
