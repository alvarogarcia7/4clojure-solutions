(fn [initial]
  (into #{} (map (fn [coll] (into #{} coll)) (filter (fn [coll] (> (count coll) 1)) (map (fn [word] (filter (fn [n] (= (frequencies word) (frequencies n))) initial)) initial)))))
