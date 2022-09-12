import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int length = s.length();
        int max_length = 0;
        Set<Character> check = new HashSet<>();
        
        while(right < length){
            if(check.contains( s.charAt(right)) == true){
                
                while((left < right) && check.contains(s.charAt(right)) == true){
                    check.remove(s.charAt(left));
                    left++;
                }
            }
            
            check.add(s.charAt(right));
            max_length = Math.max(max_length, right-left+1);
            right++;
            
        }
        
        return max_length;
    }
}