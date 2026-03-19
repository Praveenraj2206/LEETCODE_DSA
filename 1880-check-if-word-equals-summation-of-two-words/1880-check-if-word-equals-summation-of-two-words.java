class Solution 
{
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) 
    {
        int num1 = wordToNumber(firstWord);
        int num2 = wordToNumber(secondWord);
        int num3 = wordToNumber(targetWord);
        return num1 + num2 == num3;
    }

    public int wordToNumber(String word) 
    {
        int value = 0;
        for (int i = 0; i < word.length(); i++) 
        {
            int digit = word.charAt(i) - 'a';
            value = value * 10 + digit;
        }
        return value;
    }
}