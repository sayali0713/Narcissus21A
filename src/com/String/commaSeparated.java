package com.String;

public class commaSeparated {
	public static void withMethod() {
		String name = "String";
		String[] s=name.split("");
		String separated = String.join(",", s);
		System.out.println(separated);
	}
	public static void WithForLoop() {
		String name = "String";
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i)+",");
		}
	}
	public static void main(String[] args) {
		WithForLoop();
	
	
	}

}
