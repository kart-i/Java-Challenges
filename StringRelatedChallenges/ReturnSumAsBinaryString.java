package StringRelatedChallenges;

public class ReturnSumAsBinaryString {
	
	public String addBinaryNumbersRepresentedAsString(String A, String B) {
		
		int index1 = A.length();
		int index2 = B.length();
		
		char char1 = A.charAt(index1-1);
		char char2 = B.charAt(B.length()-1);
		
		int carry =0;
		
		int value1 = 0;
		int value2 = 0;
		
		int sum = 0;
		
	while(index1>=0||index2>=0 || carry>0) {
		
		if(value1!=0) {
			 value1 = char1 - 0;
		}else {
			 value1 = 0;
		}
		
		if(value2!=0) {
			 value2 = char2 - 0;
		}else {
			 value2 = 0;
		}
		
		if(value1!=0||value2!=0||carry!=0) {
			sum = value1+value2+carry;
		}
		
		index1--;
		index2--;
	}	
		
		

			
	 }
	
	public static void main(String[] args) {
		
		ReturnSumAsBinaryString obj = new ReturnSumAsBinaryString();
		System.out.println(obj.addBinaryNumbersRepresentedAsString("1010", "1011"));
		
	}
}
