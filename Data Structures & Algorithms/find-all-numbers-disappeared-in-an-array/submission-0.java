class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set <Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
          if(!s.contains(i)){
            l.add(i);
          }
        }
        return l;
    }
}