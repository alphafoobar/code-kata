(ns kata02-binary-search.core-test
  (:require [clojure.test :refer :all]
            [kata02-binary-search.core :refer :all]))

(deftest empty-list-test
  (testing "If the list is empty then expect -1."
    (is (= -1 (chop -1 [])))))

(deftest list-of-1-test
  (testing "Test binary search in a list of 1 items"
    [(is (= -1 (chop -1 [1]))),
     (is (= 0 (chop 1 [1])))]
    )
  )

(deftest list-of-3-test
  (testing "Test binary search in a list of 3 items."
    [(is (= 0 (chop 1 [1, 3, 5]))),
     (is (= 1 (chop 3 [1, 3, 5]))),
     (is (= 2 (chop 5 [1, 3, 5]))),
     (is (= -1 (chop 0 [1, 3, 5]))),
     (is (= -1 (chop 2 [1, 3, 5]))),
     (is (= -1 (chop 4 [1, 3, 5]))),
     (is (= -1 (chop 6 [1, 3, 5])))]
    )
  )

(deftest list-of-4-test
  (testing "Test binary search in a list of 4 items."
    [(is (= 0 (chop 1 [1, 3, 5, 7]))),
     (is (= 1 (chop 3 [1, 3, 5, 7]))),
     (is (= 2 (chop 5 [1, 3, 5, 7]))),
     (is (= 3 (chop 7 [1, 3, 5, 7]))),
     (is (= -1 (chop 0 [1, 3, 5, 7]))),
     (is (= -1 (chop 2 [1, 3, 5, 7]))),
     (is (= -1 (chop 4 [1, 3, 5, 7]))),
     (is (= -1 (chop 6 [1, 3, 5, 7]))),
     (is (= -1 (chop 8 [1, 3, 5, 7])))]
    )
  )
