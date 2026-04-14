class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<String> l=Arrays.asList(strs);
        Collections.sort(l,Comparator.comparing(String::length));
        String s=l.get(0);
        String prefix="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=1;j<l.size();j++){
                if(l.get(j).charAt(i)!=ch){
                    return prefix;
                }
                
            }
            prefix+=ch;
        }
 return prefix;
    }
   
}