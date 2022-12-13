// two pointer approach

class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero=0;
        int k=0;
        for(int i=0;i<nums.length&&nonzero<nums.length;i++){
            if(nums[i]==0) nonzero++;
            else{
                nonzero=i;
                int temp=nums[nonzero];
                nums[nonzero]=nums[k];
                nums[k]=temp;
                k++;
                nonzero++;
            }
        }
    }
}
