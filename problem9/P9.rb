catch :done do
	1.upto(999) do |a|
		(a + 1).upto(999) do |b|
			c = Math.sqrt(a ** 2 + b ** 2)
			if c == c.to_i && a + b + c == 1000
				puts a * b * c
				throw :done
			end
		end
	end
end
