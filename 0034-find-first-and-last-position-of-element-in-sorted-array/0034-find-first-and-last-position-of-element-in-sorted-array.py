class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def test_location(nums,target,mid):
            if nums[mid] == target:
                return "found"
            elif nums[mid] < target:
                return "right"
            else:
                return "left"

        def first(nums,target,low,high):
            while low < high:
                mid = (low+high)//2
                if nums[mid] < target:
                    low = mid+1
                else:
                    high = mid
            return low if nums[low] == target else -1

        def last(nums,target,low,high):
            while low < high:
                mid = (low+high+1)//2
                if nums[mid] > target:
                    high = mid-1
                else:
                    low = mid 
            return low if nums[low] == target else -1

        low , high = 0 , len(nums)-1
        while low <= high:
            mid = (low+high)//2
            position = test_location(nums,target,mid)
            if position == "found":
                start = first(nums,target,low,mid)
                end = last(nums,target,mid,high)
                return[start,end]
            elif position == "left":
                high = mid-1
            else:
                low = mid+1
        return [-1,-1]

        