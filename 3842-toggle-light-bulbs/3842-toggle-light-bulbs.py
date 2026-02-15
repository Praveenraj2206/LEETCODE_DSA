class Solution(object):
    def toggleLightBulbs(self, bulbs):
        count=Counter(bulbs)
        new=[]
        for key,value in count.items():
            if value%2 != 0:
                new.append(key)
        return sorted(new)


    # def toggleLightBulbs(self, bulbs):
    #     bulb_states = [False] * 101
    #     for bulb_num in bulbs:
    #         bulb_states[bulb_num] = not bulb_states[bulb_num]
    #     result = []
    #     for i in range(1, 101):
    #         if bulb_states[i]:
    #             result.append(i)
    #     return result