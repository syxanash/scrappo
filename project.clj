(defproject scrappo "0.1.0-SNAPSHOT"
  :description "a tool to read the interweb"
  :url "https://syxanash.github.io"
  :license {:name "DWTFYWT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [enlive "1.1.6"]
                 [http-kit "2.1.18"]]
  :main ^:skip-aot scrappo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
