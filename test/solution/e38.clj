(ns solution.e38
  (:require [solution.common :refer :all]))

(def __ (read-source-file "e38"))

(iss
  (= (__ 1 8 3 4) 8)

  (= (__ 30 20) 30)

  (= (__ 45 67 11) 67))
