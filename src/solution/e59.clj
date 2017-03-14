(fn [& ops]
  (fn [& args]
    (map #(apply % args) ops)))
