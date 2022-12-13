//using new array

class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int i=0;
        int res[]=new int[nums.length];
        while(i++ < nums.length-1){
            if(nums[i]!=0) 
            {
                res[k]=nums[i];
                k++;
            }
        }
      System.out.println(Arrays.toString(res));
    }
}
