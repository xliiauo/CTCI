# @param {Integer[]} digits
# @return {Integer[]}
def plus_one(digits)
    number = digits.join.to_i + 1
    number.to_s.chars.map(&:to_i)
end
