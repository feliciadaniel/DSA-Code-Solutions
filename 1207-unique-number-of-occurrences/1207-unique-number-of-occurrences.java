class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Set<Integer> s = new HashSet<>();
        for(int x : map.values()){
            s.add(x);
        }
        return map.size() == s.size();
    }
}