package StringRelatedChallenges;
import java.util.HashMap;
import java.util.Map;

public class checkAnagram {
	
	public boolean checkIfAnagram(String string1, String string2) {

		String trimmedString1 = string1.trim();
		String trimmedString2 = string2.trim();

		char[] charArray1 = trimmedString1.toCharArray();
		char[] charArray2 = trimmedString2.toCharArray();

		if(charArray1.length != charArray2.length) {

			return false;
		}


		Map <Character,Integer> map = new HashMap<Character, Integer>();

		for(char key1 : charArray1) {

			map.put(key1, map.getOrDefault(key1, 0)+1);

		}

		for(char key2 : charArray2) {

			if(map.containsKey(key2)) {

				Integer storedValue = map.get(key2)-1;
				map.put(key2, storedValue);

			}else {
				return false;
			}
		}

		System.out.println(map.values());

		for(Integer value : map.values()) {

			if(value != 0) {

				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		

	}

}
