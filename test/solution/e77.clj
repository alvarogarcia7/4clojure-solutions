(ns solution.e77
   (:require [solution.common :refer :all]))

(def __ (read-source-file "e77"))

(iss
   (= (__ ["meat" "mat" "team" "mate" "eat"])
      #{#{"meat" "team" "mate"}})

   (= (__ ["veer" "lake" "item" "kale" "mite" "ever"])
      #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}))
