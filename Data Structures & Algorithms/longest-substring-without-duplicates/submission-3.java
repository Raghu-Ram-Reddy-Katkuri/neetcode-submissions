class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character, Integer> map=new HashMap<>();

        int n=s.length(), left=0, max=0;

        for(int right=0;right<n;right++)
        {
            char ch=s.charAt(right);

            if(map.containsKey(ch) && map.get(ch)>=left)
            {
                left=map.get(ch)+1;
            }
                max=Math.max(max, right-left+1);
                map.put(ch, right);
        }
        return max;
        
    }
}
