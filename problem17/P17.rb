def num_letters(n)
	letters = 0

	case n
	when 1 
		letters = "one".length
	when 2 
		letters = "two".length
	when 3 
		letters = "three".length
	when 4 
		letters = "four".length
	when 5 
		letters = "five".length
	when 6 
		letters = "six".length	
	when 7 
		letters = "seven".length
	when 8 
		letters = "eight".length
	when 9 
		letters = "nine".length
	when 10
		letters = "ten".length
	when 11
		letters = "eleven".length
	when 12
		letters = "twelve".length
	when 13
		letters = "thirteen".length
	when 14
		letters = "fourteen".length
	when 15
		letters = "fifteen".length
	when 16
		letters = "sixteen".length
	when 17
		letters = "seventeen".length
	when 18
		letters = "eighteen".length
	when 19
		letters = "nineteen".length
	when 20
		letters = "twenty".length
	when 21..29 
		letters = num_letters(20) + num_letters(n - 20)
	when 30
		letters = "thirty".length
	when 31..39 
		letters = num_letters(30) + num_letters(n - 30)
	when 40
		letters = "fourty".length
	when 41..49 
		letters = num_letters(40) + num_letters(n - 40)
	when 50
		letters = "fifty".length
	when 51..59 
		letters = num_letters(50) + num_letters(n - 50)
	when 60
		letters = "sixty".length
	when 61..69 
		letters = num_letters(60) + num_letters(n - 60)
	when 70
		letters = "seventy".length
	when 71..79 
		letters = num_letters(70) + num_letters(n - 70)
	when 80
		letters = "eighty".length
	when 81..89 
		letters = num_letters(80) + num_letters(n - 80)
	when 90
		letters = "ninety".length
	when 91..99 
		letters = num_letters(90) + num_letters(n - 90)
	when 100..999 && 
		letters = num_letters(n / 100) + "hundred".length + "and".length + num_letters(n / 10)
	when 1000 
		letters =	"one thousand".length - 1
	end
end

