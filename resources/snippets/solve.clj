(ns clj.exch
  (:require [permutation.solve :refer [solve]]))

(def t { 0 1, 1 2, 2 3, 3 4, 4 5, 5 0 })
(def s { 0 2, 1 1, 2 0, 3 3, 4 4, 5 5 })

(def state {0 0, 1 1, 2 2, 3 3, 4 4, 5 5})

(solve [t s] ["t" "s"] state)
