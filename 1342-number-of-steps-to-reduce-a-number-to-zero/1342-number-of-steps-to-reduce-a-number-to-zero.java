class Solution 
{
    private int count=0;
    public int numberOfSteps(int num) 
    {
        if(num==0)
            return count;
        if((num&1) != 1)
            num = num/2;
        else
            num -= 1;
        count += 1;
        return numberOfSteps(num);
    }
}


// class Solution 
// {
//     public int numberOfSteps(int num) 
//     {
        
//     }
// }

// class Solution 
// {
//     public int numberOfSteps(int num) 
//     {
//         int count=0;
//         while(num>0)
//         {
//             if((num&1) != 1)
//             {
//                 num = num/2;
//                 count += 1;
//             }
//             else
//             {
//                 num -= 1;
//                 count += 1;
//             }
                
//         }
//         return count;
//     }
// }