import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Convert string to char array for sorting
        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        // Sort characters based on their frequency in descending order
        Arrays.sort(charArray, (a, b) -> {
            return charFrequency.get(b) - charFrequency.get(a) != 0
                    ? charFrequency.get(b) - charFrequency.get(a)
                    : a.compareTo(b);
        });

        // Convert Character array back to String
        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            result.append(c);
        }
        return result.toString();
    }
}