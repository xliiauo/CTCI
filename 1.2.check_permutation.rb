def check_permutation s1, s2
  s1.chars.sort == s2.chars.sort
end

puts check_permutation "aa", "aaa"
puts check_permutation "hello", "olleh"