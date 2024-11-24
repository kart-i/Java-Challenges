package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
	
	  public int sumOfUniqueElements(int[] nums) {

//		  int sumOfElements = 0;
	  
//		  Set<Integer> unique = new HashSet<Integer>();
	//
//		  Set<Integer> duplicate = new HashSet<Integer>();
	//
//		  for(int element : nums) {
	//
//				if(unique.add(element)) {
//					
//					sumOfElements = sumOfElements + element;
//					
//				}
//				else{
//					
//					if(duplicate.add(element)) {
//						
//						sumOfElements = sumOfElements - element;
//					}
	//
//				}	
//				
//			}
		   	
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
