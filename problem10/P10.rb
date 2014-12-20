require 'prime'

puts Prime.each(1_999_999).reduce(:+)
