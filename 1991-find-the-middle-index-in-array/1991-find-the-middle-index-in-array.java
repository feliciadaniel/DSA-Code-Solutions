class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int [] arr_l = new int[n];
        int [] arr_r = new int[n];
        arr_l[0] = 0;
        for(int i=1;i<n;i++){
            arr_l[i] = arr_l[i-1]+nums[i-1];
        }
        arr_r[n-1] = 0;
        for(int i = n-2;i >= 0;i--){
            arr_r[i] = arr_r[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(arr_l[i]==arr_r[i]){
                return i;
            }
        }
        return -1;
    }
}