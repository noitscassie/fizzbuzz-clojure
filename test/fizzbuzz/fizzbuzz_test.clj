(ns fizzbuzz.fizzbuzz-test
  (:use midje.sweet)
  (:use [fizzbuzz.fizzbuzz])
)

(facts "about `fizzbuzz`"
  (fact "it returns 'fizz' for multiples of 3"
    (fizzbuzz 3) => "fizz"
  )
)
