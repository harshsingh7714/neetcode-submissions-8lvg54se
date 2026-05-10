class Solution {
    public boolean isIsomorphic(String s, String t) {
       Map<Character,Integer> m1=new LinkedHashMap<>();
        Map<Character,Integer> m2=new LinkedHashMap<>();
       for(int i=0;i<s.length();i++ ){
        char c1=s.charAt(i);
        char c2=t.charAt(i);

        if(m1.get(c1)!=m2.get(c2)){
            return false;
        }
        m1.put(c1,i);
        m2.put(c2,i);
       }

       System.out.println(m1);
       return true;
    }
}