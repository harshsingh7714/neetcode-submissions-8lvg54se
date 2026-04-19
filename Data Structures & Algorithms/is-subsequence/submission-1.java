class Solution {
    public boolean isSubsequence(String s, String t) {
      char cs[]=s.toCharArray(); 
       char ct[]=t.toCharArray(); 
       int i=0,j=0;
       while (i < cs.length && j < ct.length) {

            if (cs[i] == ct[j]) {
                i++;
            }

            j++;
        }

        if (i == cs.length) {
            return true;
        }

        return false;
    }
}