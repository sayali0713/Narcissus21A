package com.String;

public class palindrome {
	public static void main(String[] args) {
		String s="nitin";
		StringBuffer sb= new StringBuffer(s);
		StringBuffer temp= sb.reverse();
		String s2= temp.toString();
		if(s.equals(s2)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");

		}
		
		
	}
}
