(defproject workshub/leona "0.1.3-SNAPSHOT"
  :description "A pipeline for working with clojure.spec and GraphQL"
  :url "https://github.com/acron0/leona"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.walmartlabs/lacinia "0.31.0"]
                 [metosin/spec-tools "0.8.0"]
                 [camel-snake-kebab "0.4.0"]]
  :profiles {:dev {:dependencies [[org.clojure/test.check "0.10.0-alpha3"]]}}
  :repositories [["releases" {:url "https://clojars.org/repo"
                              :creds :gpg}]
                 ["snapshots" {:url "https://clojars.org/repo"
                               :creds :gpg}]])
