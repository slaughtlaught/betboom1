(ns file-test
	(:require [clojure.test :as t]
			  [file :as sut]))

(t/deftest mytest-test
	(t/is (= 2 (sut/res "4:0" "4:0")))
	(t/is (= 0 (sut/res "4:0" "3:5")))
	(t/is (= 1 (sut/res "0:0" "3:3")))
	(t/is (= 1 (sut/res "4:0" "3:1"))))




