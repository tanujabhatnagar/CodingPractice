package Problem3;

import java.util.Scanner;

class Solution1 {

    public int reverse(int x) {
      int res = 0, rem = 0;
      while(x != 0) {
          rem = x % 10;                                                            //getting last digit
          x = x/10;                                                               //getting rest of the digits
          if(Math.abs(res) > (Integer.MAX_VALUE- Math.abs(rem))/10) return 0;
          res = (res * 10) + rem;                                               // reversing integer with last value
      }
      
      return res;
  }
    public static void main(String[] args) {
    	Solution1 ob=new Solution1();
    	Scanner sc=new Scanner(System.in);
    	int tc=sc.nextInt();
    	while(tc>0) {
    	int num=sc.nextInt();
    	System.out.println(ob.reverse(num));
    	tc--;
    	}
    }
}
