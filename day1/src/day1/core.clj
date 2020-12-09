(ns day1.core
  (:gen-class)
  (:require [clojure.string :as str]))

(def goal-number 2020)

(defn get-difference [number] 
  (- goal-number number))


(defn to-result [n]
  (* n (- 2020 n)))

(defn solve-task [numbers]
  (do
    (assert (> (count numbers) 0) #"No input")    
    (let [lookup-table 
          (reduce #(conj %1 (get-difference %2)) #{} numbers) ]
      (to-result
       (let [answers 
             (filter #(contains? lookup-table %) numbers)]
         (do
           (assert (> (count answers) 0) #"No answer")
           (first answers)))))))

(defn read-numbers [filename]
  (map read-string (str/split-lines (slurp filename))))

(defn -main
  "I fix Santa tax return."
  [& args]
  (println (solve-task (read-numbers (first args)))))
