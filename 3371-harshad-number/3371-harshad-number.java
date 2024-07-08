class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        int n=x;
        int sum=0;
        while(x>0)
        {
        
            int a=x%10;
            sum+=a;
            x=x/10;
        }
        if(n%sum==0)
        {
            return sum;
        }
        else
        {
            return -1;
        }
        
    }
}