class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        List<List<String>> result=new ArrayList<>();

        HashMap<String,ArrayList<String>> map=new HashMap<>();

        for(String s : strs)
        {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);

            if(!map.containsKey( str ))
            {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        } 

        for(ArrayList<String> arr : map.values())
        {
            result.add(arr);
        }
        return result;
    }
}
