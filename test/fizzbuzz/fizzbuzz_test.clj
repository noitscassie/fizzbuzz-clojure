(ns fizzbuzz.fizzbuzz-test
  (:use midje.sweet)
  (:use [fizzbuzz.fizzbuzz])
)

(facts "about `fizzbuzz`"
  (fact "it returns 'fizz' for multiples of 3"
    (fizzbuzz 3) => "fizz"
    (fizzbuzz 6) => "fizz"
    (fizzbuzz 9) => "fizz"
    (fizzbuzz 12) => "fizz"
  )
  (fact "it returns 'buzz' for multiples of 5"
    (fizzbuzz 5) => "buzz"
    (fizzbuzz 10) => "buzz"
  )
  (fact "it returns 'fizzbuzz' for multiples of 3 and 5"
    (fizzbuzz 15) => "fizzbuzz"
    (fizzbuzz 30) => "fizzbuzz"
  )
  (fact "it returns the input number if it is not a multiple of 3 or 5"
    (fizzbuzz 1) => 1
    (fizzbuzz 2) => 2
    (fizzbuzz 4) => 4
    (fizzbuzz 7) => 7
    (fizzbuzz 8) => 8
    (fizzbuzz 11) => 11
    (fizzbuzz 13) => 13
    (fizzbuzz 14) => 14
  )
)
