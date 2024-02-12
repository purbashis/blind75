class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
            }
            if (cand == nums[i]) {
                count++;
            } else {
                count--;
            }

        }
        return cand;
    }
}

//here we using Moore's voting algorithm,
// it is a method to find the majority element in an array of numbers.