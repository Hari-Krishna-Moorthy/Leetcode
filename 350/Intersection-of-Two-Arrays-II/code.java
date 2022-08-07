class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[len];
        for(int num : nums1) {
            if(!map.containsKey(num)) 
                map.put(num, 0);
            map.put(num, map.get(num)+1);
        }
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num)-1);
                res = Arrays.copyOf(res, ++len);
                res[len-1] = num;
            }    
        }
        return res;
    }
}