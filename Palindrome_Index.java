import java.io.*;
import java.util.*;
public class Solution{
    public static boolean isPalindrome(StringBuilder sb){
        boolean isPal =true;
        for(int k=0,j=sb.length()-1;k<sb.length()/2 && j>sb.length()/2;k++,j--){
            if(sb.charAt(k)!=sb.charAt(j)){
                isPal=false;
                break;
            }
        }
        return isPal;
    }
    
    public static void findIndex(String str){
        if(isPalindrome(new StringBuilder(str))){
             System.out.println(-1);
            return;
        }
        Map<Character,Integer> m = new HashMap<>();
        char[] s = str.toCharArray();
        for(int k=0;k<s.length;k++){
            if(m.get(s[k])!=null){
                m.put(s[k],m.get(s[k])+1); 
            }
            else{
                m.put(s[k],1); 
            }
        }
        for(int k=0;k<s.length;k++){
            if(m.get(s[k])%2==1){
                StringBuilder sb =new StringBuilder(str);
                sb.deleteCharAt(k);
                boolean found= isPalindrome(sb);
                if(found){
                    System.out.println(k);
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        for(int i=0;i<tests;i++){
            String str=br.readLine();
            if(str!=null){
                 findIndex(str);
            }
        }
    }
}