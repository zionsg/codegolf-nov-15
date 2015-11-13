(defn c [s]
  (if (->> (range 1 27)
           (mapcat #(repeat % %))
           (map #(char (+ 96 %)))
           (apply str)
           (= s )) 
      42 
      -1))
