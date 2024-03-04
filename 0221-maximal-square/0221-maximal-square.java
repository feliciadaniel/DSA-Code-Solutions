class Solution {
    public int maximalSquare(char[][] matrix) {
       int [][] mat =new int [matrix.length][matrix[0].length];
       int [][] m =new int [matrix.length][matrix[0].length];
       int max=1,flag=0;
       for(int i =0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               mat[i][j]=Character.getNumericValue(matrix[i][j]);
               if(i==0||j==0){
                   m[i][j]=mat[i][j];
               } 
               if(m[i][j]==1){
                   flag=1;
               }   
           }
       }
       for(int i =1;i<matrix.length;i++){
           for(int j=1;j<matrix[0].length;j++){
            if(mat[i][j]==0){
                m[i][j]=0;
            }
            else{
                flag=1;
                m[i][j]=Math.min(m[i-1][j],Math.min(m[i-1][j-1],m[i][j-1])) + 1;
                if(m[i][j]>max){
                    max=m[i][j];
                }
            }
            System.out.println(m[i][j]);
        }
       } 
      if(flag==0){
           return 0;
       }
      return max*max; 
    }
}