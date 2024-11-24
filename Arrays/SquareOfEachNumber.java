package Arrays;

import java.util.Arrays;

public class SquareOfEachNumber {
	
	public int[] squareOfEachNumber(int[] array1){
		
		int[] arr = new int[array1.length];
		
		
		for(int i=0;i<array1.length;i++) {
			
			arr[i] = array1[i] * array1[i];
			
		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		return arr;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
