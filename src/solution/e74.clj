(fn [xs]
  (letfn [(perfect-square [n] (= (Math/pow (int (Math/sqrt n)) 2) (double n)))
          (parse-int [s] (Integer/parseInt (re-find #"\A-?\d+" s)))
          (get-values [xs] (map parse-int (clojure.string/split xs #",")))
          (format-values [values] (clojure.string/join "," values))]
    (->> xs
         get-values
         (filter perfect-square)
         format-values)))
