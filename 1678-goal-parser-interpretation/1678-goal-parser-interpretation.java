class Solution {
    public String interpret(String command) {
        StringBuilder parsed= new StringBuilder();
        for(int i=0;i<command.length();++i){
            char current=command.charAt(i);
            if(current=='G'){
                parsed.append(current);
            }
            else if(current=='('){
                if(command.charAt(i+1)==')'){
                    parsed.append("o");
                    i=i+1;
                }
                else{
                    parsed.append("al");
                    i+=3;
                }
            }
        }
        return parsed.toString();
    }
}