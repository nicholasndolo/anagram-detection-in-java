package com.nicholasndolo;

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

}
