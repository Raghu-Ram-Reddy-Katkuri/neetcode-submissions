class Solution {
    public int[] topKFrequent(int[] nums, int k)
    {
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        PriorityQueue<Integer[]> pq=new PriorityQueue<>((a, b)-> Integer.compare(b[1], a[1]));

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            pq.offer(new Integer[]{entry.getKey(), entry.getValue()});
        }

        int[] ans=new int[k];

        for(int i=0;i<k;i++)
        {
            Integer[] arr=pq.poll();
            ans[i]=arr[0];
        }
        return ans;
        
    }
}
