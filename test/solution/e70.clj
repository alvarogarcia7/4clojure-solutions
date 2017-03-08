(ns solution.e70
   (:require [clojure.test :refer :all]))

(defn iss [& forms]
   (doall (map #(is %) forms)))

(defn __ [args] ((load-file "src/solution/e70.clj") args))

(deftest canary (= true true))

(iss
   (= (__ "Have a nice day.")
      ["a" "day" "Have" "nice"])

   (= (__ "Clojure is a fun language!")
      ["a" "Clojure" "fun" "is" "language"])

   (= (__ "Fools fall for foolish follies.")
      ["fall" "follies" "foolish" "Fools" "for"]))
