class Solution {
    public boolean halvesAreAlike(String s) {
        int l=s.length();
        if(counter(s,0,((l/2)-1))==counter(s,l/2,l-1)){
            return true;
        }
        else{
            return false;
        }

    }
    private int counter (String str,int start,int end){
        int count=0;
        for (int i=start;i<=end;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }
} 