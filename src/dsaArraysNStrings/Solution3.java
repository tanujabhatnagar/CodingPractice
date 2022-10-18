package dsaArraysNStrings;

public class Solution3 {
	boolean isUnique(String str) {
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
		for(int j=i;i<str.length();i++) {
			if(str.charAt(j)==c) return false;
		}
		}
		return true;
	}
	public static void main(String[] args) {
		Solution3 ob=new Solution3();
		System.out.println(ob.isUnique("Hi,m Rohan"));
	}

}
