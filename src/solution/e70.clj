(fn [text]
  (letfn [(words [text] (clojure.string/split text #"\W+"))
          (sort-by-contents [tokens] (sort (fn [a b] (.compareTo (.toLowerCase a) (.toLowerCase b))) tokens))]
    (-> text
        words
        sort-by-contents)))
