class Solution {
    public boolean isPalindrome(int x) 
    {
        int y;
        int sum=0;
        int a;
        y=x;
        while(x>0)
        {
            a=x%10;
            sum=(sum*10)+a;
            x=x/10;

        }
        if(sum==y)
        {
            return true;
        }
        else
           {
            return false;
        }

        
    }
}