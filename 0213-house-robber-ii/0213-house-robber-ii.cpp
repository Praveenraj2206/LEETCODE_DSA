
class Solution {
public:

    // Normal House Robber function
    int solve(vector<int>& nums, int start, int end) {

        int n = nums.size();

        // If only one house in range
        if(start == end)
            return nums[start];

        vector<int> dp(n);

        dp[start] = nums[start];
        dp[start + 1] = max(nums[start], nums[start + 1]);

        for(int i = start + 2; i <= end; i++) {

            dp[i] = max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[end];
    }

    int rob(vector<int>& nums) {

        int n = nums.size();

        // Only one house
        if(n == 1)
            return nums[0];

        // Case 1 -> skip last house
        int case1 = solve(nums, 0, n - 2);

        // Case 2 -> skip first house
        int case2 = solve(nums, 1, n - 1);

        return max(case1, case2);
    }
};