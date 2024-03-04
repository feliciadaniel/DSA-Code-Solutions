class Solution {
        public int rob(int[] nums) {
        int houses=nums.length;
        if(houses==1){
            return nums[0];
        }
        return Math.max(maxrob(nums,0,houses-2),(maxrob(nums,1,houses-1)));
    }
    private int maxrob(int [] nums, int start,int end){
        int prevnorob=0;
        int prevrob=0;
        for(int i=start;i<=end;i++){
            int temp_no_rob=Math.max(prevnorob,prevrob);
            prevrob=prevnorob+nums[i];
            prevnorob=temp_no_rob;
        }
        return Math.max(prevrob,prevnorob);
    }
}