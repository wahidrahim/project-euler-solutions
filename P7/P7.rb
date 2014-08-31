require 'prime'

# easy way:
puts Prime.first(10001)[10000]

# harder-for-no reason way:
#c = 0
#n = 2
#until c == 10001
#  c += 1 if n.prime?
#  n += 1
#end

#puts n
