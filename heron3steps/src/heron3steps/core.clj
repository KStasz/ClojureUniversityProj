(ns heron3steps.core)

(defn -main [])

(defn square
  [x]
  (* x x))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [y x]
  (< (abs (- x (square y))) 0.00001))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [y x]
  (avg y (/ x y)))


(defn heron-sqrt
  [y x z]
  (if (or (good-enough? y x) (== z 0))
    y
    (heron-sqrt (improve y x) x (dec z))))



(println (double (heron-sqrt 1 25 3)))