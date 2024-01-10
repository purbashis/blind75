class Solution {
    public int climbStairs(int n) {
        if(n==0 | n ==1 ){
            return 1;
        }
      int one =1;
      int two=2;

        for(int i=3;i<=n;i++){
            int total = one+two;
            one = two;
            two =total;
        }
        return  two;
    }
}
//leetcode-70