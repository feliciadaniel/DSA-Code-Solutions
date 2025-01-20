class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] arr_left = new int[n];
        int[] arr_right = new int[n];
        arr_left[0] = nums[0];
        for (int i = 1;i < n;i++){
            arr_left[i] = arr_left[i-1]+nums[i];
        }
        arr_right[n-1] = nums[n-1];
        for (int i = n-2;i >= 0;i--){
            arr_right[i] = arr_right[i+1]+nums[i];
        }
        for(int i = 0;i < n;i++){
            if( arr_left[i] == arr_right[i]){
                return i;
            }
        }
        return -1;
    }
}