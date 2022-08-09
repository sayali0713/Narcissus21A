package com.array;

import java.util.Arrays;

public class removeFirstRepeatedNumber {
	public static void main(String[] args) {
		int c=0;
		int counter=0;
		int[] a= new int[] {1,2,3,4,5,1};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					counter++;
				}
				if(counter==1) {
					System.out.println("Repeated number is"+ a[i]);
					c=a[i];
				}
			}
		}
		//a=ArrayUtils.
	}

}
