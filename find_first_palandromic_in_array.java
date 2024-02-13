class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();

            if (word.equals(reversed)) {
                return word;
            }
        }
        return "";
    }
}
// 2108. Find First Palindromic String in the Array