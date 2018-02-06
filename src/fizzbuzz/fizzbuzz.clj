(ns fizzbuzz.fizzbuzz)

(defn fizzbuzz [number]
  (cond
    (= (mod number 15) 0) "fizzbuzz"
    (= (mod number 3) 0) "fizz"
    :else "buzz"
  )
)
