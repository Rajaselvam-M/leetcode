class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            //int b=0;
            if(count==1)
            {
             b=nums[i];
                break;

            }
        count=0;
        }
    
    return b;
}
}





