//Question : Implement an algorithm to determine if a string has all unique characters.What if you cannot use additional data structures?

//using a bit vector

//Assuming small letter and capital letter as not unique
package dsaArraysNStrings;

import java.util.Scanner;

public class Solution2 {
	public boolean isUnique(String str) {
		int checker=0;
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i); 
			if((checker&(1<<val))>0) {
				return false;
			}
			checker|=(1<<val);
		}
		return true;
	}
	public static void main(String[] args) {
		Solution2 ob=new Solution2();
		System.out.println(ob.isUnique("isThPJNn!@#$%789"));
		
	}

}
