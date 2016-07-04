(ns bob)

(defn- silence? [phrase]
  (empty? (.trim phrase)))

(defn- shouting? [phrase]
  (and (not (silence? phrase))
       (=   (.toUpperCase phrase))))

(defn- question? [phrase]
  (cond
        (silence? phrase)   "Fine"
        (shouting? phrase)  "Whoa"
        (question? phrase)  "Sure"
        :else               "Whatever"))
