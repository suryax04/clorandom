(defproject clorandom "1.0.0-SNAPSHOT"
  :description "A simple wrapper around the Java Random class"
  :url " https://github.com/suryax04/clorandom.git    "
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]

  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                          ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]])