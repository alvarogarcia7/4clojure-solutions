(fn
  [coll n] 
  (let [dest (into [] (->> (range n) (map (fn [_] []))))
        in-which-array (map #(mod % n) (range (count coll)))
        merged (mapv #(-> [%1 %2]) coll in-which-array)
        add-at-position (fn [acc ind val] 
          (assoc acc ind (conj (nth acc ind) val)))]
  (reduce (fn [acc [val ind]] 
      (add-at-position acc ind val)) dest merged)))
