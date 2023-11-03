class Solution {
    public int lengthOfLastWord(String s) {
        int x=0;
        String[] arr=s.split(" ");
        return arr[arr.length-1].length();
    }
}