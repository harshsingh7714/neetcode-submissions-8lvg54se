class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> s=new ArrayList<>();
        for(int i=0;i<m;i++){
            s.add(nums1[i]);
        }
        for(int j=0;j<n;j++){
            s.add(nums2[j]);
        }
        int a=0;
        Collections.sort(s);
        for(int val:s){
            nums1[a]=val;
            a++;
        }
    }
}