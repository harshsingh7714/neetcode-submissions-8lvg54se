class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int n=2*l;
       int ans[]=new int[n];
       for(int i=0;i<n;i++){
       if(i<(n/2)){
        ans[i]=nums[i];
       }
       else{
        ans[i]=nums[i-(n/2)];
       }
       }
       return ans;
}
}