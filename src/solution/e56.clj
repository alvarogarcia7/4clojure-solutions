(fn
  [coll]
  (letfn [(add-if-not-present
            [acc ele]
            (if (nil? (some #{ele} acc))
              (conj acc ele)
              acc))]
    (reduce add-if-not-present [] coll)))
