// URL : https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        int countZero = 0;  
        for(int num : nums) {
            if(num == 0)
                countZero++;
        }   
        int j = 0;
        for(int i=0;i<nums.length-countZero;i++) {
            while(nums[j] == 0)
                j++;
            nums[i] = nums[j++];
        }
        for(int i = nums.length-countZero; i<nums.length; i++) 
            nums[i] = 0;
    }
}