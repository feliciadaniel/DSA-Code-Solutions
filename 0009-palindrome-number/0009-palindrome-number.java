class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        int temp=x;
        while (x>0){
        y=(y*10)+(x%10);
        x=x/10;
        }
        if(y==temp){
            return true;
        }
        return false;
    }
}