//Assuming case sensitive
//Using hashset

package dsaArraysNStrings;

import java.util.HashSet;

public class Solution4 {
	boolean isUnique(String str) {
		 HashSet<Character> char_set = new HashSet<>();
		    for(int c  = 0; c< str.length();c++)
		    {
		        char_set.add(str.charAt(c));
		    }
		    return char_set.size() == str.length();
	}
	public static void main(String[] args) {
		Solution4 ob=new Solution4();
		System.out.println(ob.isUnique("Hi,i'm Rohan"));
	}

}
