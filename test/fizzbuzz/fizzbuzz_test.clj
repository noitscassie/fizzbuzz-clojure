(ns fizzbuzz.fizzbuzz-test
  (:use midje.sweet)
  (:use [fizzbuzz.fizzbuzz])
)

(facts "about `fizz`"
  (fact "it returns 'fizz' for 3"
    (fizzbuzz 3 :default) => "fizz" 
    ))
