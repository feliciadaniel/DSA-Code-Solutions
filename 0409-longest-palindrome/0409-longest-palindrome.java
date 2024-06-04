class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> charset= new HashSet<>();
        int length=0;
        for(char c:s.toCharArray()){
            if(charset.contains(c)){
                charset.remove(c);
                length+=2;
            }
            else{
                charset.add(c);
            }
        }
        if(!charset.isEmpty()){
            length+=1;
        }
        return length;
    }
}