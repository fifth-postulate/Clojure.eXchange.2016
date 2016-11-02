(ns clj.exch
  (:require [permutation.naive :refer [elements-generated-by]]))

(elements-generated-by {0 1, 1 2, 2 0} {0 1, 1 0, 2 2})

