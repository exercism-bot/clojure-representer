(ns two-fer)

(defn two-fer [& name] ;; <- arglist goes here
  ;; your code goes here
  (str "One for " (or (first name) "you") ", one for me.")
)
