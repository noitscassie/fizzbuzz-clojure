(ns fizzbuzz.fizzbuzz)

(defn fizzbuzz [number]
  (cond
    (= (mod number 15) 0) "fizzbuzz"
    (= (mod number 5) 0) "buzz"
    (= (mod number 3) 0) "fizz"
    :else number
  )
)
