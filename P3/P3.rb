require 'prime'

number = 600851475143
root = Math.sqrt(number).to_i
max = 0

2.upto(root) do |n|
	max = n if number % n == 0 && Prime.prime?(n)
end

puts max;
