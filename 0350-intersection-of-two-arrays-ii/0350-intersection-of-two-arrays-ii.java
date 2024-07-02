class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> count  = new HashMap<>();
        List<Integer> listt = new ArrayList<>();
        for(int num: nums1){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(count.getOrDefault(num,0)>0){
                listt.add(num);
                count.put(num,count.get(num)-1);
            }
        }
        int [] res = new int[listt.size()];
         for (int i = 0; i < res.length; ++i) {
            res[i] = listt.get(i);
        }
        return res;
    }
}