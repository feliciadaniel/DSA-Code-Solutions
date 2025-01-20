class Solution:
    def search(self, nums: List[int], target: int) -> int:
        n = len(nums)
        low = 0
        high = n-1
        while low <= high:
            mid = (low + high)//2
            if nums[mid] == target:
                return mid
            # left side sorted
            if nums[low] <= nums[mid]:
                if nums[low] <= target and nums[mid] >= target:
                    high = mid - 1
                else:
                    low = mid + 1
            # right side sorted
            else:
                if nums[mid] <= target and target <= nums[high]:
                    low = mid + 1
                else:
                    high = mid - 1
        return -1            