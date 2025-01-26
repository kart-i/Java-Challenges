package practice;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		String name = "My Name is Nikhil";
		char[] arr	= name.trim().replaceAll("\\s", "").toCharArray();
		Arrays.sort(arr);
		for(char c:arr) {
			System.out.print(c);
		}
	
	}

}
