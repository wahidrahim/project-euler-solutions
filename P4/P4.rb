def palindrome?(number)
	number.to_s.reverse.to_i == number
end

max = 0

999.downto(100) do |x|
	999.downto(100) do |y|
		max = x * y if max < x * y && palindrome?(x * y)
	end
end

puts max
