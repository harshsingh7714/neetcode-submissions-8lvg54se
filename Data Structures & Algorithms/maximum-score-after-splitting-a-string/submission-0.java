class Solution {
    public int maxScore(String s) {
        int max=0;
        String l="",r="";
        for(int i=0;i<s.length()-1;i++){
             l=s.substring(0,i+1);
             r=s.substring(i+1);
             int c1=0,c0=0;
             
             for(int x=0;x<l.length();x++){
                if(l.charAt(x)=='0'){
                    c0++;
                }
             }
             for(int y=0;y<r.length();y++){
                 if(r.charAt(y)=='1'){
                    c1++;
                }
             }
             int sum=c0+c1;
             if(max<sum){
                max=sum;
             }
        }
        return max;
    }
}