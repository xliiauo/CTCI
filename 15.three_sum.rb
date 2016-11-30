def three_sum nums
  result = []
  find_result(result, nums.sort!).uniq
end

def find_result result, nums
  nums.each_with_index do |target, index|
    element = []
    (index + 1..nums.size - 1).each do |i|
      element.include?(-target - nums[i]) ? result << [target, -target - nums[i], nums[i]] : element << nums[i]
    end
  end
  result
end

print three_sum([-1, 0, 2, 3, -5, 1, -4, 0, 0, 0, 1, 2]), "\n"
