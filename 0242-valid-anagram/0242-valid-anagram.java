class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            char[] ss=s.toCharArray();
            char[] tt=t.toCharArray();
            Arrays.sort(ss);
            Arrays.sort(tt);
            if(Arrays.equals(ss,tt)){
                return true;
            }
           return false;
        }
        return false;
    }
}