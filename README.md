# clorandom

A Clojure library designed to randomize numbers for you.

Never call the java random class from clojure again. :)

Instead, you do (randomify 100) to generate a random number from 0 - 100.



## Usage

;;For use with lein project 

add dependency to your project.clj:

[clorandom "1.0.0-SNAPSHOT"]

add namespace to your core.clj:

(:require [clorandom.core :as r])

call it with :

(r/randomify 100) ;; use whichever number you want .

;; For use with Clojure-REPL :

create a deps.edn file and add the following line to it :

{:deps { clorandom {:mvn/version "1.0.0-SNAPSHOT"}}}

Fire up your repl:

clojure 

;; It will download the dependency

Now in the repl:

(require '[clorandom.core :as r ])

Call it 

(r/randomify 100)


## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
