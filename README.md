# Posture


[![Dependency Status](https://www.versioneye.com/user/projects/538a4da514c158772800004c/badge.svg)](https://www.versioneye.com/user/projects/538a4da514c158772800004c)

A Clojure library designed to wrap the Postmon service to find addresses by ZIP code

## Releases and Dependency Information

Latest stable release is [0.1.3](https://github.com/PostmonAPI/posture/tree/v0.1.3)

[Leiningen] dependency information:

    [posture "0.1.3"]

You can find the Posture artifacts at [Clojars](https://clojars.org/posture)

## Usage

Examples:

    (require '[posture.zip :as zip])

To find an address:

    (zip/find-address "01001-001")
    ;; => {:result :ok, :complemento "lado par", :bairro "Sé", :cidade "São Paulo",
    ;;     :logradouro "Praça da Sé", :estado_info {:area_km2 "248.222,801",
    ;;     :codigo_ibge "35", :nome "São Paulo"}, :cep "01001001", :cidade_info
    ;;     {:area_km2 "1521,101", :codigo_ibge "3550308"}, :estado "SP"}


## License

Copyright © 2014 Plínio Balduino, The Postmon team

Distributed under the MIT License.
