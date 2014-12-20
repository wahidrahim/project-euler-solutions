sum = 0
fib1 = 1
fib2 = 2
tfib = fib2

while tfib <= 4000000
	sum += tfib if tfib % 2 == 0

	tfib = fib1 + fib2
	fib1 = fib2
	fib2 = tfib
end

puts sum
