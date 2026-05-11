class Solution {
    public int maxDifference(String s) {
       Map<Character,Integer> m=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(m.containsKey(c)){
            m.put(c,m.get(c)+1);
        }else{
            m.put(c,1);
        }
       } System.out.print(m);
       int max=1;int min=Integer.MAX_VALUE;
       for(Map.Entry<Character,Integer>e:m.entrySet()){
        if(e.getValue()%2!=0 &&max<e.getValue()){
            max=e.getValue();
        }
       
        if(e.getValue()%2==0 && min>e.getValue()){
            min=e.getValue();
        }
        
       }
       return max-min;
    }
}