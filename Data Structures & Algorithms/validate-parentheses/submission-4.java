class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1= new Stack<>();
        int n=s.length();
       if(s.length()%2!=0){
        return false;
       }
       for(int i =0;i<n;i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
            s1.push(s.charAt(i));
        }
        if(s.charAt(i)==')'){
            if(s1.isEmpty() ||s1.peek()!='('){
               return false;
            }
             s1.pop();
        }
        else if(s.charAt(i)=='}'){
            if(s1.isEmpty() || s1.peek() !='{'){
                 return false;
            }
            s1.pop();
        }
        else if(s.charAt(i)==']'){
            if(s1.isEmpty() || s1.peek()!='['){
                 return false;
            }
            s1.pop();
        }
        
       }
       if(!s1.isEmpty()){
        return false;
       }
        
        return true;
    }
}
