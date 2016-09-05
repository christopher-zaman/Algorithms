import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean ispangram(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        //System.out.println(str);
        for(char i : str.toCharArray()){
            if(map.get(i) == null){
                map.put(i, 1);
                //System.out.println("Adding " + i + " to map.");
            }
            else{
                map.put(i, map.get(i) + 1);
                //System.out.println("Incrementing value of " + i);
            }
        }
        //System.out.println(map.size());
        if(map.size() == 26){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String str = "";
        try{
            str = br.readLine();
        }
        catch(IOException io){
            io.printStackTrace();
        }
        str = str.toLowerCase();
        str = str.replaceAll("\\s+","");
        //boolean result = true;
        boolean result = ispangram(str);
        //System.out.println(result);
        if(result){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}