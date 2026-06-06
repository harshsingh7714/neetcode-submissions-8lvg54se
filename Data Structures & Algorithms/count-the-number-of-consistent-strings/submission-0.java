class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s:words){
           int cc=0;
            for(int j=0;j<s.length();j++){
                char ch= s.charAt(j);
              if(allowed.contains(String.valueOf(ch))){
                cc++;
              }
            }
            if(cc==s.length()){
                count++;
            }
            
        }
        return count;
    }
}