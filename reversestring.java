public class Solution {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start<end){
            ch[start] = (char)(ch[start]^ch[end]);
            ch[end] = (char)(ch[start]^ch[end]);
            ch[start] = (char)(ch[start]^ch[end]);
            start++;
            end--;
        }
        return new String(ch);
    }
}
