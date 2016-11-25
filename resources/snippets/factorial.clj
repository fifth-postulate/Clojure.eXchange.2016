(defn factorial [n]
  (reduce * 1 (map inc (range n))))

(factorial 3)
