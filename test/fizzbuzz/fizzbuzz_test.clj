(ns fizzbuzz.fizzbuzz-test
  (:use midje.sweet)
  (:use [fizzbuzz.fizzbuzz])
)

(facts "about `fizzbuzz`"
  (fact "it returns 'fizz' for multiples of 3"
    (fizzbuzz 3) => "fizz"
    (fizzbuzz 6) => "fizz"
    (fizzbuzz 9) => "fizz"
  )
  (fact "it returns 'buzz' for multiples of 5"
    (fizzbuzz 5) => "buzz"
    (fizzbuzz 10) => "buzz"
  )
)
