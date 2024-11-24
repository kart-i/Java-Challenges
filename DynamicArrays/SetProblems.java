package DynamicArrays;
import java.util.HashSet;
import java.util.Set;

public class SetProblems {


	public boolean happyNumber(int number) {
		
		
		if(number<=0) {
			
			return false;
		}

		int quotient = number;
	
		Set<Integer> set = new HashSet<Integer>();

		while((!set.contains(quotient))){
			
			int sum = 0;
			set.add(quotient);
			
			int temp = quotient;
		
			while(temp>0) {

				int remainder = temp%10;
				int squareOfRemainder = remainder*remainder;
				sum = sum + squareOfRemainder;

				temp = temp/10;

			}
			
			quotient = sum;
			if(sum ==1) {
				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {

		SetProblems obj = new SetProblems();

		System.out.println(obj.happyNumber(19));

	}


}
