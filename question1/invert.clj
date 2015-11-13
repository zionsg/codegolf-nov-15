(defn r [s]
  (apply str (map #(+ 1 (- 48 (int %))) s)))
