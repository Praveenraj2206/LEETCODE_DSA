class Solution 
{
    public List<String> list=new ArrayList<>();
    public List<String> letterCombinations(String digits) 
    {
        if (digits.length() == 0)
            return list;
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        solve(0,digits,new StringBuilder(),map);
        return list;
    }
    public void solve(int index,String digits,StringBuilder temp,Map<Character,String> map)
    {
        if(index>=digits.length())
        {
            list.add(temp.toString());
            return;
        }
        char ch=digits.charAt(index);
        String str=map.get(ch);
        for(int i=0;i<str.length();i++)
        {
            temp.append(str.charAt(i));
            solve(index+1,digits,temp,map);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}