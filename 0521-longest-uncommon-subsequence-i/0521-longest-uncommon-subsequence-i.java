class Solution {
    public int findLUSlength(String a, String b) {
        int d=a.length();
        int c=b.length();
        if(a.equals(b))
        {
           return -1;
        }
        int ans=Math.max(d,c);
        return ans;


    }
}