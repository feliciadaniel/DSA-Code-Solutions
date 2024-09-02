class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length == (m*n)){
        int [] [] arr = new int[m][n];
        int index = 0;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = original[index++];
            }
        }
        return arr;
        }
        else{
            return new int [0][0];
        }
    }
}