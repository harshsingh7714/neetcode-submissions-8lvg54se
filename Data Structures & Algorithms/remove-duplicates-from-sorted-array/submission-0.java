class Solution {
    public int removeDuplicates(int[] nums) {
       Set <Integer> s=new LinkedHashSet<>();
       for(int i=0;i<nums.length;i++){
        s.add(nums[i]);
       } 
       int k=s.size();
       int i=0;
       for(int val:s){
        nums[i]=val;
        i++;
       }
       return k;
    }
}