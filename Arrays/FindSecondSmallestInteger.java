package Arrays;

public class FindSecondSmallestInteger {
	
	public int secondSmallest(int[] num) {
		
		int small = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		
		for(int value : num) {
			
			if(value<small) {
				
				secondSmall = small;
				small = value;	
			
			}
			else if(value<secondSmall && value>small )
			{
				
				
				secondSmall = value;
				
				
			}	
		}
		
		if(secondSmall == Integer.MAX_VALUE ) {
			
			return -1;
		}
		
		return secondSmall;
		
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
