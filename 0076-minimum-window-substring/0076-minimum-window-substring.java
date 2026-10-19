class Solution 
{
    public String minWindow(String s, String t) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=map.size();
        int startIndex = -1;
        int ws=0,curr=0;
        int minLen=Integer.MAX_VALUE;
        int N=s.length();

        while(curr<N)
        {
            // Expansion
            char ch=s.charAt(curr);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0)
                    count--;
            }
            
            // Shrinking
            while(count == 0)
            {
                int len = curr-ws+1;
                if(len<minLen)
                {
                    minLen = len;
                    startIndex = ws;
                }
                ch=s.charAt(ws);
                if(map.containsKey(ch))
                {
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch) > 0)
                        count++;
                }
                ws++;
            }
            curr++;
        }
        if(startIndex == -1)
            return "";
        return s.substring(startIndex,startIndex+minLen);
    }
}