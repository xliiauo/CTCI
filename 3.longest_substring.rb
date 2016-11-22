# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
    return s.length if is_unique?(s)
    current_length = 0
    result = ""
    (s.length).downto(1).each do |j|
        (0...(s.length - j)).each do |i|
            return result.length if (s.length - j) < current_length

            if is_unique?(s[i, j])
                sub_str = s[i, j]
                if sub_str.length > current_length
                    result = sub_str
                    current_length = sub_str.length
                end
            end
        end
    end

    result.length
end

def is_unique? string
    string.chars == string.chars.uniq
end
