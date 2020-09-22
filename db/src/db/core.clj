(ns db.core)

(defn -main [])

(defonce persons-atom (atom {}))

(defn add-person!
  [email first-name last-name city street st-no postal]
  (swap! persons-atom assoc
         email {:first-name first-name
                :last-name   last-name
                :city city
                :street street
                :st-no st-no
                :postal postal}))
(defn first-name
  [email]
  (:first-name (@persons-atom email)))

(defn last-name
  [email]
  (:last-name (@persons-atom email)))

(defn address
  [email]
  (str (:city (@persons-atom email))
  (:street (@persons-atom email))
  (:st-no (@persons-atom email))
  (:postal (@persons-atom email))))


    (add-person! "adam@gmail.com" "Adam" "Adamiak" "Poznan " "1 Maja " "7 " "52-320")

(println (first-name "adam@gmail.com")
         (last-name "adam@gmail.com")
         (address "adam@gmail.com"))
