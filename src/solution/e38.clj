(fn
  [& rest]
  (reduce #(if (> % %2) % %2) (first rest) rest))
