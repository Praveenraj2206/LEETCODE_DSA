class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {

        int totalGas = 0;
        int totalCost = 0;

        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.size(); i++) {

            totalGas += gas[i];
            totalCost += cost[i];

            // Current fuel after moving
            tank += gas[i] - cost[i];

            // Cannot move further
            if (tank < 0) {

                // Next station becomes new start
                start = i + 1;

                // Reset tank
                tank = 0;
            }
        }

        // Total gas insufficient
        if (totalGas < totalCost) {
            return -1;
        }

        return start;
    }
};