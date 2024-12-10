package StringRelatedChallenges;

public class ReturnSumAsBinaryString {
	public String addBinaryNumbersRepresentedAsString(String A, String B) {
		int positionOfStringA = A.length()-1;
		int positionOfStringB = B.length()-1;
		int carry = 0;
		
		StringBuilder sb = new StringBuilder();
		
		while(positionOfStringA>=0 || positionOfStringB>=0 || carry>0 ) {
			int characterAtPositionA = positionOfStringA>=0?A.charAt(positionOfStringA)-'0':0;
			int characterAtPositionB = positionOfStringB>=0?B.charAt(positionOfStringB)-'0':0;
			int sum = characterAtPositionA  + characterAtPositionB + carry;
			
			sb.append(sum%2);
			carry = sum/2;
	
			positionOfStringA--;
			positionOfStringB--;	
		}
		return sb.reverse().toString();	
	}
	public static void main(String[] args) {	
		ReturnSumAsBinaryString obj = new ReturnSumAsBinaryString();
		System.out.println(obj.addBinaryNumbersRepresentedAsString("1010", "1011"));
	}
}
