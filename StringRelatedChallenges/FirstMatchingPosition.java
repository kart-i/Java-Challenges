package StringRelatedChallenges;

public class FirstMatchingPosition {

	public int firstMatchingPosition(String h, String n) {


		if(n.length() == 0) {

			return 0;
		}
		return h.indexOf(n);

	}

	public static void main(String[] args) {
		

	}

}
