class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        int s=0;
        char c1[]=word1.toCharArray();
        char c2[]=word2.toCharArray();
        String res="";
        if(l1<l2){
            s=l1;
        }
        else if(l1>l2){
            s=l2;
        }else if(l1==l2){
            s=l1;
        }
        for(int i=0;i<s;i++){
                res+=c1[i];
                res+=c2[i];
        }
        if(l1>s){
            res+=word1.substring(s,l1);
        }
        if(l2>s){
         res+=word2.substring(s,l2); 
        }
        return res;
    }
}