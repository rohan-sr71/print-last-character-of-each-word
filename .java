import java.util.*;

class Hello
  
    
    static void printLastChar(String str) 
    { 
  
         
        str = str + " "; 
        for (int i = 1; i < str.length(); i++) 
        { 
            if (str.charAt(i) == ' ')
                System.out.print(str.charAt(i - 1) + " "); 
        } 
    } 
  
    
    public static void main(String s[]) 
    { 
        String str = "Hello World"; 
        printLastChar(str); 
    } 
}
