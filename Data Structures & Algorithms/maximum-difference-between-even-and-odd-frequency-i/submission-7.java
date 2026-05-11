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
       List<Integer> l=new ArrayList<>();
       int max=1;int min=1;
       for(Map.Entry<Character,Integer>e:m.entrySet()){
        if(e.getValue()%2!=0 &&max<e.getValue()){
            max=e.getValue();
        }
       
        if(e.getValue()%2==0 ){
            l.add(e.getValue());
       
        }
        
       }
       Collections.sort(l);
       min=l.get(0);
       return max-min;
    }
}