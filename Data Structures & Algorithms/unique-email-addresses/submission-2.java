class Solution {
    public int numUniqueEmails(String[] emails) {
        String email="";
        Set<String> ans=new HashSet<>();
        for(String s:emails){
         String ln="",dn="";
         for(int i=0;i<s.length();i++){
         char c=s.charAt(i);
         if(c=='@'){
            ln=s.substring(0,i);
            dn=s.substring(i);
            break;
         }
         }
        StringBuilder vs = new StringBuilder();
         for(int j=0;j<ln.length();j++){
            char x=ln.charAt(j);
             if(x!='.'){
                if(x=='+'){
                break;}
                vs.append(x);
             }
         }
         email=vs.toString()+dn;
         System.out.println(email);
         ans.add(email);
        }
        return ans.size();
    }
}