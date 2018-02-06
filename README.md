# fizzbuzz

## Intro

This is a project to write [fizzbuzz](https://en.wikipedia.org/wiki/Fizz_buzz) in Clojure, as part of early experimentation with Clojure in specific and an introduction to functional programming in general. This program was built in a test-driven manner using the [Midje](https://github.com/marick/Midje/) testing framework.


## Quickstart

To run this project, make sure you have both [Clojure](https://clojure.org/) and [Leiningen](https://leiningen.org/) installed on your device. Clone or fork this repo and enter the Lein REPL from the project directory:

`lein repl`

Load the fizzbuzz file:

`(load "fizzbuzz/fizzbuzz")`

Enter the namespace for the fizzbuzz file:

`(in-ns 'fizzbuzz.fizzbuzz)`

You will now have access to the fizzbuzz method and can run commands such as the following:

```
(fizzbuzz 3)     ## -> "fizz"
(fizzbuzz 4)     ## -> 4
(fizzbuzz 5)     ## -> "buzz"
(fizzbuzz 15)    ## -> "fizzbuzz"
```


## How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.


## Resources

For learning Clojure:
 - Clojure [docs](https://clojure.org/)

For TDD in Clojure:
 - https://sites.google.com/site/unclebobconsultingllc/home/articles/tdd-in-clojure
 - https://engineering.fundingcircle.com/blog/2016/01/11/tdd-in-clojure/
 - https://www.linkedin.com/pulse/getting-started-tdd-clojure-richard-wild/
