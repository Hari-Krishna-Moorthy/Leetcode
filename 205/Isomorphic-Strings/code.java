class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        int n = s.length();
        
        for(int i=0;i<n;i++) {
            char ch1 = s.charAt(i), ch2 = t.charAt(i);
            
            if(!map1.containsKey(ch1)) {
                map1.put(ch1, ch2);
            }
            if(!map2.containsKey(ch2)) {
                map2.put(ch2, ch1);
            }
            
            if(map1.get(ch1) != ch2 || map2.get(ch2) != ch1) {
                return false;
            } 
        }
        return true;
    }
}