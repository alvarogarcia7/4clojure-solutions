(fn
  [coll n] 
  (let [dest (into [] (->> (range n) (map (fn [_] []))))
        in-which-array (map #(mod % n) (range (count coll)))
        merged (mapv #(-> [%1 %2]) coll in-which-array)]
  (reduce (fn [acc [val ind]]
    (let [added (conj (nth acc ind) val)]
      (assoc acc ind added))) dest merged)))
