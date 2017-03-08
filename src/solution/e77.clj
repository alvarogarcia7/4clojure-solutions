(fn [initial]
  (letfn [(anagram? [word n](= (frequencies word) (frequencies n)))
          (only-anagrams [coll] (filter (fn [coll] (> (count coll) 1)) coll))
          (generate-equivalences [coll] (map (fn [word] (filter
                             (fn [word-] (anagram?
                               word word-)) coll)) coll))]
    (into #{} (map #(into #{} %) (only-anagrams (generate-equivalences initial))))))