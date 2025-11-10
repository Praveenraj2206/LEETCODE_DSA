class Solution 
{
    public int[][] flipAndInvertImage(int[][] image) 
    {
        for(int i=0;i<image.length;i++)
        {
            int left=0;
            int right=image.length-1;
            while(left<=right)
            {
                int temp = image[i][right]>0?0:1;
                image[i][right--] = image[i][left]>0?0:1;
                image[i][left++] = temp;
            }
        }
        // for(int i=0;i<image.length;i++)
        // {
        //     for(int j=0;j<image.length;j++)
        //     {
        //         if(image[i][j]==0)
        //         {
        //             image[i][j]=1;
        //         }
        //         else
        //         {
        //             image[i][j]=0;
        //         }
        //     }
        // }
        return image;
    }
}