class Solution {
    public int[] replaceElements(int[] arr) {
        int l=arr.length;
        int res[]=new int[l];
        for(int i=0;i<l;i++){
            if(i==l-1){
                res[i]=-1;
                continue;
            }

            int max=arr[i+1];
            for(int j=i+1;j<l;j++){ 
             if(max<arr[j]){
                max=arr[j];
             }
            }
            res[i]=max;
            
        }
       return res; 
    }
}