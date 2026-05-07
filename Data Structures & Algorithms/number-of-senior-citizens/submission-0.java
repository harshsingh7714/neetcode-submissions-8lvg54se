class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            String pn=s.substring(0,10);
            String g=s.substring(10,11);
            String a=s.substring(11,13);
            int x=Integer.parseInt(a);
            if(x>60){
                count++;            }
        }
        return count;
    }
}