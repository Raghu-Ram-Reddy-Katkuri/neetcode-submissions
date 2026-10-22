class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set=new HashSet<>();

        for(int i:nums) set.add(i);
        
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]-1)) continue;
            int count=1;
            int num=nums[i]+1;
            while(set.contains(num))
            {
                num++;count++;
            }
            max=Math.max(max, count);
        }
        return max;
        
    }
}
