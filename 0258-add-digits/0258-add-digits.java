class Solution {
    public int addDigits(int n) {
        while(n>=10){
            n = sum(n);

        }
        return n;
    }
    int sum(int n){
        int ans=0;
        while(n !=0){
            ans+=(n%10);
            n/=10;
        }
        return ans;
    }
}   