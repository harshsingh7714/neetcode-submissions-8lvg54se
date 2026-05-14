class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> m=new LinkedHashMap<>();
        Set<String> st=new LinkedHashSet<>();
        for(String s:arr){
         m.put(s,m.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer>e:m.entrySet()){
            if(e.getValue()==1){
              st.add(e.getKey());
            }
        }
        if(st.size()<k){
            return "";
        }
        List<String> list = new ArrayList<>(st);

        return list.get(k-1);
    }
}