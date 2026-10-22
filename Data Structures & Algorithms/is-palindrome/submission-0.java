class Solution {
    public boolean isPalindrome(String s)
    {
        s=s.toLowerCase();
        StringBuilder s1=new StringBuilder("");
        for(char ch:s.toCharArray())
        {
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9')
            s1.append(ch);
        }
      
        int l=0, r=s1.length()-1;
        while(l<r)
        {
            if(s1.charAt(l)!=s1.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
