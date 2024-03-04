class Solution {
    public int numTrees(int n) {
        int [] arr =new int [n+1];
        arr[0]=1;
        for(int nodes=1;nodes<=n;nodes++){
        for(int root=1;root<=nodes;root++){
            arr[nodes]+=arr[root-1]*arr[nodes-root];
        }
        }
        return arr[n];
    }
}