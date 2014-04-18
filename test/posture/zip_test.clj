(ns posture.zip-test
  (:require [clojure.test :refer :all]
            [posture.zip :refer :all]))

(deftest mock-test
  (binding [*postmon-url* "test/resources/"]
    (testing "03979000"
      (let [address (find-address "03979000")]
        (is (= (:cidade address) "São Paulo"))
        (is (= (-> address :cidade_info :codigo_ibge) "3550308"))))))

(deftest with-server
  (testing "03979000"
    (let [address (find-address "03979000")]
      (is (= (:cidade address) "São Paulo"))
      (is (= (-> address :cidade_info :codigo_ibge) "3550308"))))

  (testing "03979-000"
    (let [address (find-address "03979-000")]
      (is (= (:cidade address) "São Paulo"))
      (is (= (-> address :cidade_info :codigo_ibge) "3550308"))
      (is (= (:result address) :ok))))

  (testing "not found"
    (let [address (find-address "00000000")]
      (is (= (:result address) :not-found)))))
