class Solution {
    public int majorityElement(int[] nums) {
        
        Map <Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }
            else{
                m.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()>(n/2)){
                return e.getKey();
            }
        }
        return 0;
    }
}