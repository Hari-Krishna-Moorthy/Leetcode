// URL : https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshape = new int[r][c];
        int row = 0 ,col = 0;
        if(mat.length * mat[0].length != r*c){
            return mat;
        }
        for(int[] nums : mat) {
            for(int num : nums) {
                reshape[row][col++] = num;
                if(col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        
        return reshape;
    }
}