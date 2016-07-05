(ns bob
  (:require [clojure.string :refer [upper-case lower-case blank? ends-with?]]))

(defn is-upper [text]
  "Determines whether text is upper case"
  (and (= (upper-case text) text)
       (not= (lower-case text) text)))

(defn response-for [text]
  (cond
    (blank? text) "Fine. Be that way!"
    (is-upper text) "Whoa, chill out!"
    (ends-with? text "?") "Sure."
    :else "Whatever."))
