# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
  nums.each_with_index do |num, i|
    j = nums.index(target - num)
    return [i, nums.index(target - num)] if j != i && !j.nil?
  end
end
