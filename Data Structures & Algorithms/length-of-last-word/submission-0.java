class Solution {
    public int lengthOfLastWord(String s) {
        int l=s.length();
        String a[]=s.trim().split(" ");
        int al=a.length;
        String res=a[al-1];
        return res.length();
    }
}