package StringRelatedChallenges;

public class GetCommonPrefix {
  /* public String getCommonPrefix(String[] stringArray) {
		int start = 0;
		boolean matches = true;
		String subToCheck = "";
	
		for(int end=stringArray[0].length();end>0;end--){
			for(int j=1;j<stringArray.length;j++) {
				matches = true;
				subToCheck= stringArray[0].substring(start,end);
				if(!stringArray[j].startsWith(subToCheck)) {
					matches = false;
					break;
				}	
			}if(matches) {
				return subToCheck;
			}
		 }	
		 return "\"\"";
	}
   */
	
	
	public String getCommonPrefix(String[] arr) {
		
		int start = 0;
		int end = arr[0].length();
		boolean matches = true;
		
		
		
		while(end>0) {
			String prefix = arr[0].substring(start, end);	
			for(String value : arr) {
				matches =true;
				if(!value.startsWith(prefix)){
					end--;
					matches = false;
					break;
				}
			}
			if(matches) {
				return prefix;
			}
			
		}
		return "false";
			
	}
	
	public static void main(String[] args) {
		GetCommonPrefix obj = new GetCommonPrefix();
		String[] stringArray = new String[3];
		stringArray[0] = "wlower";
		stringArray[1] = "dlow";
		stringArray[2] = "glowght";
		
		System.out.println(obj.getCommonPrefix(stringArray));	
	}
}
