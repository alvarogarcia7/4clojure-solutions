(fn [& ops]
  (fn [& args]
    (println ops)
    (map (fn [op] (apply op args)) ops)))
