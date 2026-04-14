class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }else{
                m.put(nums[i],1);
            }
        }
        
        int c[]=new int[k];
        List<Map.Entry<Integer,Integer>>e=new ArrayList<>(m.entrySet());//converting map to list
            e.sort((a,b)->b.getValue()-a.getValue());//sorting descending order based on map values
        for(int j=0;j<k;j++){
            c[j]=e.get(j).getKey();
        }
        return c;
    }
}
