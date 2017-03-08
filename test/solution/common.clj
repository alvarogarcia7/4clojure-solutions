(ns solution.common
  (:require [clojure.test :refer :all]))

(defn iss [& forms]
  (doall (map #(is %) forms)))

(defn file- [filename] (load-file (str "src/solution/" filename ".clj")))

(deftest canary (= true true))
