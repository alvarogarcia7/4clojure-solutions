(fn [& ops]
  (fn [& args]
    (map (fn [op] (apply op args)) ops)))
