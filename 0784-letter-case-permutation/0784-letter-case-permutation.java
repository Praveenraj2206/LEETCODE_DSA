class Solution 
{
    public List<String> letterCasePermutation(String s) 
    {
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        solve(str, 0, list);
        return list;
    }

    private void solve(StringBuilder str, int index, List<String> list)
    {
        if (index == str.length())
        {
            list.add(str.toString());
            return;
        }
        char original = str.charAt(index);
        if (Character.isLetter(original))
        {
            str.setCharAt(index, Character.toLowerCase(original));
            solve(str, index + 1, list);

            str.setCharAt(index, Character.toUpperCase(original));
            solve(str, index + 1, list);

            str.setCharAt(index, original);
        }
        else
            solve(str, index + 1, list);
    }
}