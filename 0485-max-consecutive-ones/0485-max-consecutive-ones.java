class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=0;
        for(int x:nums){
            if(x==1){
                count++;
                if(max<count){
                    max = count;
                }
            }
            else{
                count=0;
            }
        }
        return max;
    }
}