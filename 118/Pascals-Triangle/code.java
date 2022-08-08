// URL : https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<> ();
        temp.add(1);
        res.add(temp);
        
        for(int i=1;i<numRows;i++) {
            temp = new ArrayList<> ();
            temp.add(1);
            int size = res.get(i-1).size();
            for(int j=1;j<size;j++) {
                temp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}