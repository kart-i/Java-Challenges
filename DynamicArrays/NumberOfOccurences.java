package DynamicArrays;

import java.util.HashMap;
import java.util.Map;

public  class NumberOfOccurences {
	
	public static void findOccurences(int[] arr) {
		
		Map <Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);			
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet() ) {
			System.out.println(entry.getKey()+":"+ entry.getValue());
			
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			
			}	
			
			
		}	
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,1,2};
		findOccurences(arr);
		
	}

}
