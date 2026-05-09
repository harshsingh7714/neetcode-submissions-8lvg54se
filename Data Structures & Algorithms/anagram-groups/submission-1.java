class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
       Map<String, List<String>> m=new HashMap<>();
       for(String s:strs){
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String x=new String(c);
        if(!m.containsKey(x)){
            m.put(x,new ArrayList<>());
        }
        m.get(x).add(s);
       }
       
        return new ArrayList<>(m.values());
    }
}
