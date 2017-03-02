(fn [xs]
  (letfn [(perfect-square [n] (= (Math/pow (int (Math/sqrt n)) 2) (double n)))
            (parse-int [s] (Integer/parseInt (re-find #"\A-?\d+" s)))] 
  (clojure.string/join "," (filter perfect-square (map parse-int (clojure.string/split xs #","))))))
