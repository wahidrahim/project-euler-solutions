n = (1..20).reduce(1) do |a, b|
	a = a.lcm(b)
end

puts n
