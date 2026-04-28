class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            m.clear();  

            for (int j = i; j < s.length(); j++) {

                if (!m.containsKey(s.charAt(j))) {
                    m.put(s.charAt(j), 1);
                    max = Math.max(max, m.size());
                } else {
                    break;  
                }
            }
        }

        return max;
    }
}
