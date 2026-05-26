class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean odd=false;
        for(int c:m.values()){
            if(c%2==0){
                length+=c;
            }
            else{
                length+=c-1;
                odd=true;
            }
        }
        if(odd){
            length+=1;
        }
        return length;
    }
}