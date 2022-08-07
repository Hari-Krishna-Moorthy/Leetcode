class Solution {
    private int searchInsert(int[] nums, int target, int low, int high) {
        int mid = low + (high - low)/2;
        if(nums[mid] == target) return mid;
        
        if(mid == 0 && nums[mid] > target) return 0;
        if(mid == nums.length-1 && nums[mid]< target) return nums.length;
        
        if(mid != 0 && nums[mid-1] < target && nums[mid] > target)
            return mid;
        if(nums[mid] < target)
            return searchInsert(nums, target, mid+1, high);
        return searchInsert(nums, target, low, mid-1);
        
    } 
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length-1);
    }
}