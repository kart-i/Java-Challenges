package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
	
	  public int sumOfUniqueElements(int[] nums) {
// Using Frequency Array : - use this method for smaller size array
	
//		  	int[] frequency = new int[101];
//		  	
//		  	for(int num : nums) {
//		  		
//		  		frequency[num]++;
//		  		
//		  	}
//		  
//		  	int sum = 0;
//		  	
//		  	for(int i=0; i<frequency.length;i++) {
//		  		
//		  		if(frequency[i] == 1) {
//		  			
//		  			sum+=i;
//		  			
//		  		}
//		  			
//		  	}
		  
// Using Frequency Map : - use this for very large array of numbers
		  
		   Map <Integer, Integer> frequency = new HashMap <Integer,Integer>();
		   
		   for(int value : nums) {
			   
			   frequency.put(value, frequency.getOrDefault(value, 0)+1);
			      
		   }
		   
		   int sum = 0;
		   
		   for(Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
			   
			   
			   if(entry.getValue() == 1) {
				   
				   sum +=entry.getKey();
				   
			   }
	     
		   }
		   return sum;
		   
		   
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
