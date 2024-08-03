class Solution {
    public String finalString(String s) {
        StringBuilder sp=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='i')
            {
                    sp.append(ch);
            }
            else
            {
                sp.reverse();
            }
            
        }
        return sp.toString();

    }
}