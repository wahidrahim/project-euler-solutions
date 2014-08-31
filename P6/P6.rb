def sum_of_squares(n)
	(1..n).reduce(0) do |sum, value|
		sum += value ** 2
	end
end

def square_of_sums(n)
	(1..n).reduce(:+) ** 2
end

puts square_of_sums(100) - sum_of_squares(100)
