import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String s) {
        Stack<String> open = new Stack<String>();
        boolean isbal = false;
        for(int i = 0; i<s.length(); i++){
            String st = ""+s.charAt(i);
            
            if(st.equals("{") || st.equals("[") || st.equals("(")){
                open.push(st);
            }
            
            if(st.equals("}") || st.equals("]") || st.equals(")")){
                String close = open.peek();
                
                if(open.isEmpty()) return false;
                
                if(st.equals("}") && close.equals("{"))  open.pop();
                
                if(st.equals("]") && close.equals("["))  open.pop();
                
                if(st.equals(")") && close.equals("("))  open.pop();
            }
            
        }
        
        if( s != null && open.isEmpty() )
            isbal = true;
        
        return isbal;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
