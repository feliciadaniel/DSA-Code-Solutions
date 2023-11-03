class Solution {
    public boolean containsDuplicate(int[] nums) {
        //base case
        if(nums==null||nums.length == 0){
            return false;
        }
        //Creating a HAshSet
        HashSet<Integer> Set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            //checks if set contains the element
            if(Set.contains(nums[i])){
                return true; //if it does, then a duplicate is present
            }
            Set.add(nums[i]);//adding elements to the set
        }
        return false;
    }
}