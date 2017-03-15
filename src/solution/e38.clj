(fn
  [& rest]
  (letfn [(greatest [a b] (if (> a b) a b))]
    (reduce greatest rest)))
