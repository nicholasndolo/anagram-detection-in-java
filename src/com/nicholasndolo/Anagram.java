package com.nicholasndolo;

import java.util.Map;
import java.util.HashMap;
public class Anagram {
    public boolean isAnagram(String original, String test){
        if(original.length() != test.length())
            return false;

        int[] charCounts = new int[26];

        for(char ch : original.toLowerCase().toCharArray())
            charCounts[ch - 'a']++;

        for(char ch : test.toLowerCase().toCharArray()) {
            charCounts[ch - 'a']--;

            if(charCounts[ch - 'a'] < 0)
                return false;
        }
        return true;
    }

 public boolean anagramDetector(String original, String test){
     if(original.length() != test.length())
         return false;

     Map<Character, Integer> map = new HashMap<>();

     for(char ch : original.toLowerCase().toCharArray()){
         var count = map.getOrDefault(ch, 0);
         map.put(ch, count + 1);
     }

     for(char ch : test.toLowerCase().toCharArray()){
         if(map.get(ch) == null || map.get(ch) == 0)
             return false;

         var count = map.get(ch);
         map.put(ch, count - 1);

     }

     return true;
    }



}
