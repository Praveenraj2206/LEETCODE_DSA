class Solution 
{
    public int maximumPopulation(int[][] logs) 
    {
        int[] pop = new int[3000];
        for(int[] i:logs)
        {
            pop[i[0]]++;
            pop[i[1]]--;
        }
        int maxi=0;
        int year=1950;
        for(int i=1950;i<=2050;i++)
        {
            pop[i] += pop[i-1];
            if(pop[i]>maxi)
            {
                maxi=pop[i];
                year=i;
            }
        }
        return year;
    }
}