def remove_duplicates nums
  elements = []
  current = 0
  nums.each do |n|
   if !elements.include? n 
      nums[current] = n
      elements << n
      current = current + 1
    end
  end
  current
end

print remove_duplicates [1,1,2]