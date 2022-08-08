// URL  : https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    private void rev(char[] ch, int i, int j) {
        if(i > j) return;
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
        rev(ch, i+1, j-1);
    }
    public String reverseWords(String s) {
        String res = "";
        for(String temp : s.split(" ")) {
            char[] ch = temp.toCharArray();
            rev(ch, 0, ch.length-1);
            res += new String(ch) + " ";
        }
        return res.strip();
    }
}