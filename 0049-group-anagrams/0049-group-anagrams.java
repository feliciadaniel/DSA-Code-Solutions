class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagram= new HashMap<>();
        for(String str:strs){
            char [] ch= str.toCharArray();
            Arrays.sort(ch);
            String word= new String(ch);
            if(!anagram.containsKey(word)){
                anagram.put(word,new ArrayList<>(List.of(str)));
            }
            else{
                anagram.get(word).add(str);
            }
        }
        return new ArrayList<>(anagram.values());
    }
}