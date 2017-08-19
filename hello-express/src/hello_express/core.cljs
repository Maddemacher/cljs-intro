(ns ^:figwheel-always hello-express.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defonce express (nodejs/require "express"))
(defonce listen-port 3000)

(defn hello [req res]
  (.send res "Hello world! asd"))

(defn -main []
  (let [app (express)]
    (.get app "/" #(hello %1 %2))
    (.listen app listen-port #(println "Server listening on" listen-port))))

(set! *main-cli-fn* -main)


(+ (+  a d) a)
