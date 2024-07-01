(ns file
	(:require [clojure.string :as str]))


(defn convert [score]
	(map read-string (str/split score #":")))


(defn winner [score]
 (cond 
 	(> (first(convert score)) (last(convert score))) "home"
 	(< (first(convert score)) (last(convert score))) "away"
 	:else "draw"))

(defn res 
	[user-score, actual-score]
	(cond
		(= actual-score user-score) 1
		(= (winner user-score) (winner actual-score)) 11 
		:else 0))

(res "2:2" "3:3")
(res "1:1" "1:1")
(res "2:1" "1:2")
(res "3:1" "4:0")
(res "1:4" "4:1")