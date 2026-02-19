package leetcode.week1;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t){

        // If they are not the same size, can't be anagrams
        if(s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }

            char d = t.charAt(i);
            if(map.containsKey(d)){
                map.put(d, map.get(d)-1);
            }
            else{
                map.put(d, -1);
            }
        }

        for(int value : map.values()){
            if(value != 0)
                return false;
        }
        return true;
    }
}
