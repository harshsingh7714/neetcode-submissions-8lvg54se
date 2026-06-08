class Solution {
    public boolean makeEqual(String[] words) {
        int l=words.length;
        Map<Character,Integer> m=new HashMap<>();
        for(String s:words){
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                m.put(c,m.getOrDefault(c,0)+1);
            }
        }
       
        for(Map.Entry<Character,Integer> e:m.entrySet()){
            if(e.getValue()%l!=0){
            return false;
            }
        }
        return true;
    }
}