class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer>m=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            char c=chars.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        List<String>l=new ArrayList<>();
        for(String w:words){
            int count=0;
        Map<Character,Integer>temp=new HashMap<>(m);
         char ch[]=w.toCharArray();
         for(char x:ch){
            if(temp.containsKey(x)&&temp.get(x)>0){
                temp.put(x,temp.get(x)-1);
                count++;
            }
         }
         if(count==w.length()){
         l.add(w);
         }
        }
        int sum=0;
        for(String y: l){
            sum+=y.length();
        }
        return sum;
    }
}