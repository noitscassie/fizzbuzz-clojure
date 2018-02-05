# fizzbuzz

## Intro

This is a project to write [fizzbuzz](https://en.wikipedia.org/wiki/Fizz_buzz) in Clojure, as part of early experimentation with Clojure in specific and an introduction to functional programming in general.

The project uses [Midje](https://github.com/marick/Midje/).

## How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.
