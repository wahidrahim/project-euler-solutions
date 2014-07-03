#lang racket

(define NUMBER 600851475143)
(define ROOT (inexact->exact (floor (sqrt 600851475143))))

;;
;; (p3) returns the largest prime factor of 600851475143
;; essentially returns the first prime divisor of NUMBER
;; less than the (integer) square root of NUMBER
;;
(define (p3)
  (define (largest-prime-divisor p)
    (cond [(and (= (remainder NUMBER p) 0) (prime? p)) p]
	  [else (largest-prime-divisor (sub1 p))]))
  (largest-prime-divisor ROOT))	

;;
;; (prime? n) validates if n is a prime
;; returns true if n is a prime, false otherwise
;;
(define (prime? n)
  (define (prime_check i)
    (cond [(> i (sqrt n)) #t]
	  [(= (remainder n i) 0) #f]
	  [else (prime_check (add1 i))]))
  (if (<= n 2) #t (prime_check 2)))
