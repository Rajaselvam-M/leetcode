class Solution {
    public String finalString(String s) {
        StringBuilder sp=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)!='i')
            {
                    sp.append(s.charAt(i));
            }
            else
            {
                sp.reverse();
            }
            
        }
        return sp.toString();

    }
}