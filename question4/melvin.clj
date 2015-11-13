(defn wave []
  (map #(char (+ 97 %)) (range 26)))

(defn rep []
  (map (fn [x] {x (char (- (int x) 32))}) (wave)))

(defn rep2 []
  (concat (rep) (rest (reverse (rep)))))

(defn q4 []
  (->> (rep2)
       (map #(replace % (wave)))
       (map #(apply str %))
       (map print)))
