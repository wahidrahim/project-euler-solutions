puts (2 ** 1000).to_s.split("").reduce(0) { |sum, num| sum += num.to_i }
