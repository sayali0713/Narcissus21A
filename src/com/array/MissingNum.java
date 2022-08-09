package com.array;

import java.util.Arrays;

public class MissingNum {
	public static void main(String[] args) {
		int[] a=new int[]{4,6,5,7,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		System.out.print("Sorted array"+a[i]);
		System.out.println("");
		int first=a[0];
		System.out.println(first);
		for(int i=1;i<a.length;i++) {
			if(a[i]==(first+1)) {
				first=a[i];
				System.out.println(a[i]);
			}else {
				System.out.println("missing num:"+(first+1));
			}
		}
		
	}

}
