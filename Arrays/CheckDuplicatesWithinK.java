package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicatesWithinK {


public boolean checkDuplicatesWithinK(int[] arr,int k){
	
	Set<Integer> set = new HashSet<Integer>();
	int i=0;
		while(i<arr.length){	
			for(int j=i+1;j<=k;j++) {
				if(!set.add(arr[j])) {
					return true;
				 }else{
						i++;
						break;
				 }    
			}
		}
		return false;
}	


	public static void main(String[] args) {
		CheckDuplicatesWithinK obj  = new CheckDuplicatesWithinK();
		boolean result	= obj.checkDuplicatesWithinK(new int[] {1, 2,3,1,4,5},3);
		System.out.println(result);
		
		
	}

}
