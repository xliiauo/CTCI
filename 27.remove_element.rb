def remove_element nums, val
  size = 0
  (nums - [val]).each.with_index do |n, i|
    nums[i] = n
    size = i + 1
  end
  size
end

def remove_element_one_pointer nums, val
  current = 0
  nums.each do |num|
    if num != val
      nums[current] = num 
      current = current + 1
    end
  end
  current
end

remove_element [3,2,2,3], 3