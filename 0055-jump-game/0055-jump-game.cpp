#include <vector>
using namespace std;

class Solution {
public:
    bool canJump(vector<int>& nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.size(); i++) {

            // If current index cannot be reached
            if (i > maxReach) {
                return false;
            }

            // Update farthest reachable index
            maxReach = max(maxReach, i + nums[i]);

            // If last index is reachable
            if (maxReach >= nums.size() - 1) {
                return true;
            }
        }

        return true;
    }
};