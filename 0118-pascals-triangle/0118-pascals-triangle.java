class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(numRows<=0) return result;
        
        List<Integer> first =new ArrayList<Integer>();
        first.add(1);
        result.add(first);
        
        for(int i=1;i<numRows;i++){
            List<Integer> before=result.get(i-1);
            List<Integer> now=new ArrayList<Integer>();
            
            now.add(1);
            
            for(int j=1;j<i;j++){
                now.add(before.get(j-1)+before.get(j));
            }
            
            now.add(1);
            
            result.add(now);
        }
        return result;
    }
}

