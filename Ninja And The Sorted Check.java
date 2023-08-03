public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int flag=1;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
            flag=0;
            break;
            }
            
        }
        return flag;
    }
}
