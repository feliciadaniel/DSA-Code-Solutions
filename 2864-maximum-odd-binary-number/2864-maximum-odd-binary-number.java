class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1=0;
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                count1++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(count1>1){
                count1--;
                res.append('1');
            }
            else{
                res.append('0');
            }
        }
        res.append('1');
        return res.toString();
    }
}