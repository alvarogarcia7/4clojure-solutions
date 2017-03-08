(ns solution.e74
  (:require [solution.common :refer :all]))

(def __ (read-source-file "e74"))

(iss
  (= (__ "15,16,25,36,37") "16,25,36")
  (= (__ "4,5,6,7,8,9") "4,9"))
