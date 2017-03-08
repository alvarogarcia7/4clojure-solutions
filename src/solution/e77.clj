  (fn [initial]
    (letfn [(anagram? [word n] (= (frequencies word) (frequencies n)))
            (only-anagrams [coll] (filter (fn [set] (> (count set) 1)) coll))
            (generate-equivalences [coll] (map (fn [word] (filter #(anagram? word %) coll)) coll))]
      (into #{} (map #(into #{} %) (only-anagrams (generate-equivalences initial))))))
