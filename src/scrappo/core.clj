(ns scrappo.core
  (:gen-class)
  (:require [net.cgrand.enlive-html :as html]
            [org.httpkit.client :as http]))

(defn extract-content-div
  [dom]
  (comp first :content) (html/select dom [:div#content]))

(defn get-dom
  ([website]
    (html/html-snippet
      (:body @(http/get website {:insecure? true}))))
  ([] "please give me a website to read"))

(defn -main
  "a cheap tool to read the interweb"
  [& args]
  (println
    (if (> (count args) 0)
      (extract-content-div (get-dom (first args)))
      (get-dom))))
