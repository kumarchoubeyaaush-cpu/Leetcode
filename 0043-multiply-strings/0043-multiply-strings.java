class Solution 
{
  public String multiply(String num1, String num2) 
  {
    final int m = num1.length();
    final int n = num2.length();

    StringBuilder sb = new StringBuilder();
    int[] ARR = new int[m + n];

    for (int i = m - 1; i >= 0; --i)
    {
      for (int j = n - 1; j >= 0; --j) 
      {
        final int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        final int sum = multiply + ARR[i + j + 1];
        ARR[i + j] += sum / 10;
        ARR[i + j + 1] = sum % 10;
      }
    }
    for (final int p : ARR)
    {
      if (p > 0 || sb.length() > 0)
        sb.append(p);
    }

    return sb.length() == 0 ? "0" : sb.toString();
  }
}