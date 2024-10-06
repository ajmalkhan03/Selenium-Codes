package java_interview_programs;

import java.util.Iterator;

public class RverseAString {

	public static void main(String[] args) {
//		String value="AJMALKHAN";
//		
//		StringBuffer buffer=new StringBuffer();
//		
//		StringBuffer append = buffer.append(value);
//		StringBuffer reverse = append.reverse();
//		System.out.println(reverse);

	
	
	String given="Ajmalkhan";
	
	char[] charArray = given.toCharArray();
	
	String reversed ="";
	
	for (int i=charArray.length-1; i>=0; i--) {
		reversed =reversed+charArray[i];
	
	}
	
	System.out.println(reversed);
	System.out.println(reversed);
	
	
	
	
	}

}
