(ns day1.core-test
  (:require [clojure.test :refer :all]
            [day1.core :refer :all]))

(deftest happy-path
  (testing "just 2 numbers which are answer"
    (is (= 40000 (solve-task [2000 20])))))

(deftest answers-on-boundaries
  (testing "5 numbers with answers on boundaries"
    (is (= 40000 (solve-task [2000 1 2 3 20])))))

(deftest answer-on-left-boundary
  (testing "5 numbers with one answer on a boundary (2 tests)"
    (is (= 40000 (solve-task [2000 1 2 20 3])))))

(deftest answer-on-right-boundary
  (testing "5 numbers with one answer on a boundary (2 tests)"
    (is (= 40000 (solve-task [1 2000 2 3 20])))))

(deftest answers-inside
  (testing "5 numbers with answers not on boundaries"
    (is (= 40000 (solve-task [1 2000 2 20 3])))))

(deftest empty-list
  (testing "empty list"
    (is (thrown? java.lang.AssertionError (solve-task [])))))

(deftest empty-list
  (testing "empty list"
    (is (thrown-with-msg? java.lang.AssertionError #"No input" (solve-task [])))))

(deftest no-answer
  (testing "non-empty list without an answer"
    (is (thrown-with-msg? java.lang.AssertionError #"No answer" (solve-task [1 2 3 4 5])))))

(deftest long-list
  (testing "really long list with answers"
    (is (= 40000 (solve-task (take 1000000 (range 20 1000000 20)))))))

