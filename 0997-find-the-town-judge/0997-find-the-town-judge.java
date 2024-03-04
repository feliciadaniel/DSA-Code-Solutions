class Solution {
    public int findJudge(int n, int[][] trust) {
        int []trusting = new int [n+1];
        int []trusted = new int[n+1];
        for(int[]arr : trust){
            trusting[arr[0]]++;
            trusted[arr[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(trusting[i]==0 && trusted[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}