(ns clorandom.core)

(defn randomify [number]
(import java.util.Random )
(.nextInt (java.util.Random.) number)




)
  
