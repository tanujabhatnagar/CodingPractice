package Problem2;

public class Solution2 {
	boolean isPalindrome(String str1,String str2) {
		if(str1.length()!=str2.length()) return false;
		int[] letters=new int[128];
		for(int i=0;i<str1.length();i++) {
			letters[str1.charAt(i)]++;
//			System.out.println(letters[str1.charAt(i)]);
		}
		for(int i=0;i<str2.length();i++) {
			letters[str2.charAt(i)]--;
//			System.out.println(letters[str2.charAt(i)]);
			if(letters[str2.charAt(i)]<0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Solution2 ob=new Solution2();
		System.out.println(ob.isPalindrome("ACDAE","AACDE"));
	}

}
