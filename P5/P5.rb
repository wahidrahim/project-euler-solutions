def divisible(n)
	1.upto(20) do |i|
		return false if n % i != 0
	end
	true
end

n = 20

until divisible(n) do
	n += 1
end

puts n
