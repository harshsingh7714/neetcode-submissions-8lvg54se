class Solution {
    public boolean isArraySpecial(int[] nums) {
        int l=nums.length;
        int c=0;
        for(int i=0;i<l-1;i++){
            if((nums[i]%2==0 && nums[i+1]%2!=0)||(nums[i]%2!=0 && nums[i+1]%2==0)){
                c++;
            }
        }
        if(c==l-1){
            return true;
        }
        return false;
    }
}