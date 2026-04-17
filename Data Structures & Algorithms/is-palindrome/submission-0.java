class Solution {
    public boolean isPalindrome(String s) {
        String sws="";
        String n="";
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')||(ch>='a'&&ch<='z'))
            {
                sws+=Character.toLowerCase(ch);
            }
        }
        for(int j=0;j<sws.length();j++){
          char c=sws.charAt(j);
           n=c+n;
        }
        if(n.equals(sws)){
            return true;
        }
       return false;
    }
}
