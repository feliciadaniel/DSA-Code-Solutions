class Solution {
    public int rob(int[] nums) {
        int prevnorob=0;
        int prevrob=0;
        for(int currenthouse:nums){
            int temp_no_rob=Math.max(prevnorob,prevrob);
            prevrob=prevnorob+currenthouse;
            prevnorob=temp_no_rob;
        }
        return Math.max(prevrob,prevnorob);
    }
}