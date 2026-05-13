class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }
            else{
                m.put(c,1);
            }
        }
        int b=m.getOrDefault('b',0);
        int a=m.getOrDefault('a',0);
        int l=m.getOrDefault('l',0)/2;
        int o=m.getOrDefault('o',0)/2;
        int n=m.getOrDefault('n',0);
         
         return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));

    }
}