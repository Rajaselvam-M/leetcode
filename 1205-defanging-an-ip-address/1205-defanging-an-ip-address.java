class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str=new StringBuilder();
        char []arr=address.toCharArray();
        for(int i=0;i<address.length();i++)
        if(arr[i]=='.')
        {
            str=str.append("[.]");
        
        }
        else
        {
            str.append(arr[i]);
        }
        return str.toString();
    }
}
