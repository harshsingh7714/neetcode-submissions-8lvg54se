class Solution {
    public boolean isAnagram(String s, String t) {
 int sl=s.length();
 int tl=t.length();
 char sa[]=s.toCharArray();
 Arrays.sort(sa);
 char ta[]=t.toCharArray();
 Arrays.sort(ta);
 int count=0;
 if(sl==tl){
for(int i=0;i<sl;i++){
    if(sa[i]==ta[i])
    count++;
}
if(count==sl)
return true;
 }
return false;
    }
}
