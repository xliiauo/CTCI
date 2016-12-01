def urlify string
  string.split.join("%20")
end

puts urlify "Mr John Smith     "