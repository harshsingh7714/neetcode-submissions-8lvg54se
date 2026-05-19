class Solution {
    public String largestGoodInteger(String num) {
        String max="";
        for(int i=0;i<num.length()-2;i++){
            char c=num.charAt(i);
            String sb=num.substring(i,i+3);
            int a=Integer.parseInt(sb);
            char ch[]=sb.toCharArray();
            if(ch[0]==ch[1]&&ch[1]==ch[2]){
             if(max.compareTo(sb) < 0) {
                    max = sb;
                }
            }
        }
        return max;
    }
}