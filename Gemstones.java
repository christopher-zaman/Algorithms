import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int gem_elements(String[] str, int n){
        /*HashMap<Character, Integer> map = new HashMap<>();
        int cnt = 0;
        for(String s : str){
            for(char c : s.toCharArray()){
                if(map.get(c) == null){
                    map.put(c, 1);
                }
                else{
                    map.put(c, map.get(c) + 1);
                }
            }
        }
        return cnt;*/
        int ans = 0;
        int[][] arr = new int[109][26];
        int flag;
        int i = 0;
        for(String s : str){
            for(char c : s.toCharArray()){
                arr[i][c - 'a']++;
            }
            i++;
        }
        for(i = 0; i < 26; i++){
            flag = 0;
            for(int j = 0; j < n; j++){
                if(arr[j][i] == 0){
                    flag = 1;
                }
            }
            if(flag == 0){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int n;
        
        n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        int total_gemelements = 0;
        for(int i = 0; i < n; i++){
            str[i] = br.readLine();
        }
        total_gemelements = gem_elements(str, n);
        System.out.println(total_gemelements);
    }
}