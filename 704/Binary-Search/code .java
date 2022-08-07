class Solution {
    private int search(int[] nums, int target, int low, int high) {
        if(low > high) return -1;
        int mid = low + (high - low) / 2;
        if(nums[mid] == target) 
            return mid;
        else if(target < nums[mid])
            return search(nums, target, low, mid-1);
        return search(nums, target, mid+1, high);        
    } 
    
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
}