(ns postmon.core
  (:require [clojure.data.json :as json]
            [clojure.walk :as walk])
  (:import [java.io FileNotFoundException]))

(def ^:dynamic *postmon-url* "http://api.postmon.com.br/v1/cep/")

(defn find-address [^String zip]
  (try
    (let [source (str *postmon-url* zip)
          content (slurp source)
          json-map (json/read-str content)
          result-map (walk/keywordize-keys json-map)]
      (conj result-map {:result :ok}))
    (catch FileNotFoundException e
      {:result :not-found})))
