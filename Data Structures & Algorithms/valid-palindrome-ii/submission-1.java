class Solution {
    public boolean validPalindrome(String s) {
        String a="";
        String b="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')||(ch>='a'&&ch<='z'))
            {
                a+=Character.toLowerCase(ch);
            }

        }
        for(int x=0;x<a.length();x++){
            char ch=a.charAt(x);
            b=ch+b;
        }
        if(b.equals(a)){
            return true;
        }
        char ch[]=a.toCharArray();

       int l=0;int r=a.length()-1;
      while(l<r)
      {if(ch[l]==ch[r]){
        l++;
        r--;
      }
      else {
                return check(a, l + 1, r) || check(a, l, r - 1);
            }
      }
      return true;  
    }
    public boolean check(String a, int l, int r) {

        while (l < r) {

            if (a.charAt(l) != a.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}