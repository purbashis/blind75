class Solution {
    public int maxSubArray(int[] nums) {
        int cursum=0;
        int maxSum = nums[0];

        for(int i=0;i<nums.length;i++){
            if(cursum<0){
                cursum=0;
            }
            cursum= cursum+nums[i];
            maxSum=Math.max(cursum,maxSum);
        }
        return maxSum;
    }
}
//leetcode-53