(fn [initial]
  (letfn [(anagram? [word n] (= (frequencies word) (frequencies n)))
          (only-anagrams [coll] (filter (fn [set] (> (count set) 1)) coll))
          (group-by-same-composition [coll] (map (fn [word] (filter #(anagram? word %) coll)) coll))]
    (->> initial
         group-by-same-composition
         only-anagrams
         (map #(into #{} %))
         (into #{}))))
