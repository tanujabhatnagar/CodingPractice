//Question : Implement an algorithm to determine if a string has all unique characters.What if you cannot use additional data structures?
//Using Array

package dsaArraysNStrings;

import java.util.Scanner;

public class Solution1 {
	public boolean isUnique(String str) {
		if(str.length()>128) return false;
		boolean[] char_set=new boolean[128];
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val]=true;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc>0) {
		String str=sc.nextLine();
		Solution1 ob=new Solution1();
		System.out.println(ob.isUnique(str));
		tc--;
		}
	}

}
