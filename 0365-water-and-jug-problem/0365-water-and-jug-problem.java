class Solution 
{
  public boolean canMeasureWater(int x, int y, int target) 
  {
    if(x+y < target)return false;
    int gcd = gcd(x,y);
    return target%gcd
==0;  }

  int gcd(int a, int b) {
    if(b==0)return a;
    return gcd(b,a%b);
  }
}