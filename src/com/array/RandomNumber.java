package com.array;

import java.util.Random;

public class RandomNumber { 
	public static void main(String[] args) {
		Random r = new Random();
		int n= r.nextInt();
		System.out.println(n);
	}

}
