(fn
  [& coll]
  (reduce #(if (> % %2) % %2) (first coll) coll))
