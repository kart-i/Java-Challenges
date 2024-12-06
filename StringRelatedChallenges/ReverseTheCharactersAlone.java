package StringRelatedChallenges;

public class ReverseTheCharactersAlone {	
public String reverseTheCharactersAlone(String input) { //ab-cd
		char[] chars = input.toCharArray();
		int startIndex = 0;
		int endIndex= chars.length-1;
	
		while(startIndex<endIndex) {
			if(Character.isLetter(chars[startIndex]) && Character.isLetter(chars[endIndex])){
				char temp = chars[startIndex];
				chars[startIndex] = chars[endIndex];
				chars[endIndex] = temp;
				startIndex++;
				endIndex--;
			}else if(!Character.isLetter(chars[startIndex])){
				startIndex++;
			}else if(!Character.isLetter(chars[endIndex])){
				endIndex--;
			}
		}
		return new String(chars);
			
	}
	
	public static void main(String[] args) {
		ReverseTheCharactersAlone obj = new ReverseTheCharactersAlone();
		System.out.println(obj.reverseTheCharactersAlone("a!!!b.c.d,e'f,ghi"));
	}		
		

}
