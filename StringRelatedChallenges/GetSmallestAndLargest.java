package StringRelatedChallenges;

public class GetSmallestAndLargest {
	
	public String getSmallestAndLargest(String s, int k) {

		String smallest = s.substring(0, 3);
		String largest = "";

		for(int i=0;i<s.length()-2;i++){
			
			int start = i;
			int end = i+3;

			String subStr = s.substring(start, end);
			if(subStr.compareToIgnoreCase(smallest)<0){
				smallest = subStr;
			}else if(subStr.compareToIgnoreCase(largest)>0){
				largest = subStr;
			}

		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
