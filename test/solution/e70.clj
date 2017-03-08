(ns solution.e70
   (:require [solution.common :refer :all]))

(def __ (read-source-file "e70"))

(iss
   (= (__ "Have a nice day.")
      ["a" "day" "Have" "nice"])

   (= (__ "Clojure is a fun language!")
      ["a" "Clojure" "fun" "is" "language"])

   (= (__ "Fools fall for foolish follies.")
      ["fall" "follies" "foolish" "Fools" "for"]))
