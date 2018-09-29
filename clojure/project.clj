(defproject clojure "0.1.0-SNAPSHOT"
  :description "Code Kata - practising better programming"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot kata02-binary-search.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
