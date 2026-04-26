class Solution {
    public boolean isValid(String st) {
      int l= st.length();
      if(l%2!=0){
        return false;
      }  

      Stack <Character> s=new Stack<>();
      for(int i=0;i<l;i++){
        char ch=st.charAt(i);
        if(ch=='('||ch=='['||ch=='{'){
            s.push(ch);
            
        }
        else if(ch==')'||ch==']'||ch=='}'){
            if(s.isEmpty()){
                return false;
            }
            if((s.peek()=='['&&ch==']')||
               (s.peek()=='{'&&ch=='}')||
               (s.peek()=='('&&ch==')'))
            {
               s.pop();
            }
            else{
                return false;
            }
            
        }
      }
      return s.isEmpty();
    }
}
