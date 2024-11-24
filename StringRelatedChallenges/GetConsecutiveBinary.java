package StringRelatedChallenges;

public class GetConsecutiveBinary {
	
	public void getConsecutiveBinary(int n){

		//convert "n" to binary number
		StringBuilder sb = new StringBuilder();
		int reminder;
		int quotient = n;
		while(quotient>=1){

			reminder = quotient%2;
			sb.append(reminder);
			quotient = quotient/2;

		}
		sb.reverse();
		String binary = sb.toString();
		System.out.println(binary);

		//count the consecutive occurrence of number "1" 


		int maxConsecutiveOccurence = 0;

		for(int i=0;i<binary.length()-1;i++) {

			int currentConsecutiveOccurence = 0;

			for(int j=1;j<binary.length();j++) {
				
				if(binary.charAt(i)=='1' || binary.charAt(j)=='1') {

					if(binary.charAt(i)=='1' && binary.charAt(j)=='1') {

						currentConsecutiveOccurence +=2;
						i++;
						
					}else{
						
						currentConsecutiveOccurence +=1;
						break;
						
					}

				}	
				
			}
			if(currentConsecutiveOccurence>maxConsecutiveOccurence) {

				maxConsecutiveOccurence = currentConsecutiveOccurence;
			}


		}
		
		if(maxConsecutiveOccurence>=1) {
			System.out.println(maxConsecutiveOccurence);
		}else {
			maxConsecutiveOccurence= maxConsecutiveOccurence-1;
			System.out.println(maxConsecutiveOccurence-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
