class Solution {
    public int scoreOfString(String s) {
        int l=s.length();
        char c[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<l-1;i++){
         char ch=s.charAt(i);
         char ch2=s.charAt(i+1);
         sum+=Math.abs((int)ch-(int)ch2);
        }
        return sum;
    }
}