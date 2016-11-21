class Solution(object):
    def two_sum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i, num in enumerate(nums):
            try:
                j = nums.index(target - num)
            except ValueError:
                j = None
            if (j != i) and (j is not None):
                return [i, j]
