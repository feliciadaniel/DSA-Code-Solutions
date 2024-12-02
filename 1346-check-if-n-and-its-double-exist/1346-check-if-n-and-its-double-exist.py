class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        Set = set()
        for num in arr:
            if num*2 in Set or num/2 in Set:
                return True
            Set.add(num)
        return False
        