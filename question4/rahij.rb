(0..25).each do |i|
  ('a'..'z').each_with_index{|a, j| print (i==j || i==26-j ? a.upcase : a)}
  p ''
end
