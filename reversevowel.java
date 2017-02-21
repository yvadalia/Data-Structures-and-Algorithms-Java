public class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length()==0) return s;
        HashSet<Character> vowel = new HashSet<Character>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
        
            while(start<end && !vowel.contains(chars[start])){
                start++;
            }
        
            while(start<end && !vowel.contains(chars[end])){
                end--;
            }
        
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
        
            start++;
            end--;
        }
        return new String(chars);
    }
}
