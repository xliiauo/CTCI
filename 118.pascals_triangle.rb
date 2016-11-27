def generate num_rows
  list = []
  (0..num_rows - 1).each do |i|
    inner_list = []
    inner_list[0] = 1
    inner_list[i] = 1
    if i > 1
      (1..i - 1).each do |j|
        inner_list[j] = list[i - 1][j - 1] + list[i - 1][j]
      end
    end
    list << inner_list
  end
  list
end