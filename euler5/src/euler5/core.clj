(ns euler5.core)

(defn -main [])

(defn divisible [n r]
  (println n)
  (= 0 (reduce + (map #(rem n %) (range 1 (inc r))))))

(defn find-number [r step]
  (first (filter #(divisible % r) (drop 1 (range 0 1e9 step)))))

(defn smallest [r]
  (loop [n 1
         multiple 1]  
    (if (> n r)
      multiple
        (recur (inc n) (find-number n r)))))

(smallest 5)

;(println (smallest 5))