class Solution {
    public boolean checkPerfectNumber(int num) 
    {
         int total = 0;
        
        if (num <= 0) return false;
        
        for (int i = 1; i * i <= num; ++i) {
            if (num % i == 0) {
                total += i;
                if (i * i != num) {
                    total += num / i;
                }
            }
        }
        
        return total - num == num;
        
    }
}