package com.array;

import java.util.Arrays;

public class DuplicateNum {
	public static void main(String[] args) {
	
		int[] a=new int[] {5,4,9,8,6,7,9};
		Arrays.sort(a);
		int counter=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]) {
				counter++;
			}
			if(counter>1) {
				System.out.println("duplicate number is"+a[i]);
			}
			}
			
			
		}
		
	}

}
