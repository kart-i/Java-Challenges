package Arrays;

public class GetCountOfUnmatchedNumbers {
	
	public int getCountOfUnmatchedNumbers(int[] array, int num) {
		
		
		int count = 0;
		for(int value : array) {
			
			if(value != num) {
				
				count++;
					
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
