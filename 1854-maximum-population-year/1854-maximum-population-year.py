from collections import OrderedDict
class Solution(object):
    def maximumPopulation(self, logs):
        people=[0]*101
        for b,d in logs:
            people[b-1950] += 1
            people[d-1950] -= 1
        for i in range(1,101):
            people[i] += people[i-1]
        maxi=max(people)
        return people.index(maxi)+1950