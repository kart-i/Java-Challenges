package StringRelatedChallenges;

public class ReturnSumAsBinaryString {
	
	public String returnSumAsBinaryString(String string1, String string2) {
		
		if(string1 == null || string1.isEmpty() || string2 == null || string2.isEmpty()) {
			
			return "Empty String";
			
		}
		
		int position_1 = string1.length()-1;
		int position_2 = string2.length()-1;
		int carry = 0;
		
		StringBuilder sb = new StringBuilder();
		
		while(position_1>=0 || position_2>=0 || carry>0) {
			
		
			int value_1 = (position_1>=0)?string1.charAt(position_1) - '0':0;
			int value_2 = (position_2>=0)?string2.charAt(position_2) - '0':0;
			
			System.out.println(value_1);
			System.out.println(value_2);
			
			int sum = value_1 + value_2 + carry;
			System.out.println("sum is :" +sum);
			sb.append(sum%2);
			carry = sum/2;
			System.out.println("carry is :"+carry);
			position_1--;
			position_2--;
			
		}
		return sb.reverse().toString();
	
	}

	public static void main(String[] args) {
		

	}

}
