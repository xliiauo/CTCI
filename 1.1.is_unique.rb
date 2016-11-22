def is_uniq string
  string.chars.uniq == string.chars
end

if $0 == __FILE__
  puts is_uniq "asdfasdfasd"
  puts is_uniq "abc"
end
