class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int total=0;
        int n=nums.length;
        sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        return sum-total;
    }
}