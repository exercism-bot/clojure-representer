(ns two-fer)

(defn two-fer [& [name]] ;; <- arglist goes here
  ;; your code goes here
  (if (= name nil) "One for you, one for me." (str "One for " name ", one for me."))
)
