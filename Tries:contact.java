import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static class Trie{
        
        Map<Character, Trie> character = new HashMap<Character, Trie>();
        int index;
        
        private Trie getTrie(char c){
            return character.get(c);        
        }
        
        private void setNode(char c, Trie t){
            index++;
            character.put(c,t);
        }
        
        private void add(String s){
            index++;
            
            if (!s.isEmpty()) {
                char c = s.charAt(0);
                if(!character.containsKey(c)){
                    character.put(c, new Trie());
                }
                character.get(c).add(s.substring(1));
            }
        }
        
        private int find(String s){
            if(s.isEmpty()) return index;
            
            char c = s.charAt(0);
            return character.containsKey(c) ? character.get(c).find(s.substring(1)) : 0;  
        }
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Trie trie = new Trie();
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
           
            String command = in.next();
            if (command.equals("add")) {
				String name = in.next();
				trie.add(name);
			} else if (command.equals("find")) {
				String partial = in.next();
				System.out.println(trie.find(partial));
			}
        }
    }
}

