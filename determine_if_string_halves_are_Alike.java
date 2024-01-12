import java.util.Set;
class Solution {
    public boolean halvesAreAlike(String s) {
        char[ ]ch= s.toCharArray();
        int left =0;
        int right = ch.length-1;
        int lcount=0;
        int rcount=0;
     // Set of vowels
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        while(left<right){
lcount+=vowels.contains(ch[left])?1:0;
rcount+=vowels.contains(ch[right])?1:0;
left++;
right--;
        }
        return lcount==rcount;
    }
}
//leetcode-1704 Determine if String Halves Are Alike