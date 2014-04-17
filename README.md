# postmon-clj

A Clojure library designed to wrap the Postmon service to find addresses by ZIP code

## Releases and Dependency Information

Latest stable release is [0.1.1]

[Leiningen] dependency information:

    [postmon-clj "0.1.1"]

## Usage

Examples:

    (require '[postmon.core :as post])

To find an address:

    (post/find-address "01001-001")
    ;; => {:result :ok, :complemento "lado par", :bairro "Sé", :cidade "São Paulo",
    ;;     :logradouro "Praça da Sé", :estado_info {:area_km2 "248.222,801",
    ;;     :codigo_ibge "35", :nome "São Paulo"}, :cep "01001001", :cidade_info
    ;;     {:area_km2 "1521,101", :codigo_ibge "3550308"}, :estado "SP"}


## License

Copyright © 2014 Plínio Balduino, The Postmon team

Distributed under the MIT License.
