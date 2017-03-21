;(fn [coll] (reduce (fn [acc ele] (if (contains? acc ele) acc (conj acc ele))) [] coll))
(fn [coll] (reduce (fn [acc ele] (if (nil? (some #{ele} acc)) (conj acc ele) acc)) [] coll))
