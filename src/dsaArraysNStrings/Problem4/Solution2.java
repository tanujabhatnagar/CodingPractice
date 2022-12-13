//two pointer approach

class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero=nums[0];
        int k=0;
        for(int i=0;i<nums.length&&nonzero<nums.length;i++){
            if(nums[i]==0) nonzero++;
            if(nums[i]!=0){
                int temp=nums[nonzero];
                nums[nonzero]=nums[k];
                nums[k]=temp;
                k++;
                nonzero++;
            }
        }
    }
}
