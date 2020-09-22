(ns heroncbrt.core)

(defn -main [])

(defn cube
  [x]
  (* x x x))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn good-enough?
  [y x]
  (< (abs (- x (cube y))) 0.0000001))

(defn improve
  [y x]
  (/ (+ (/ x (* y y)) (* 2 y)) 3))

(defn heron-cbrt
  [y x]
  (if (good-enough? y x)
    y

    (heron-cbrt (improve y x) x)))

(println (double (heron-cbrt 1 125)))