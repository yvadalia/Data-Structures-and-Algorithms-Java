import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        
        int[] lettercount = new int[26];
        
        for(char a : first.toCharArray()){
            lettercount[a-'a']++;
        }

        for(char b : second.toCharArray()){
            lettercount[b-'a']--;
        }
        
        int num = 0;
        for(int x : lettercount){
            num += Math.abs(x);
        }
        
        return num;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
