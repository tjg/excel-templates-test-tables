(ns excel-templates-test-tables.core
  (:require [excel-templates.build :as excel]))

(defn good []
  (excel/render-to-file "resources/template.xlsx"
                        "test-good.xlsx"
                        {"Sheet1" {0 [["Column1"]] ;; "Column1" is in the template too.
                                   1 [["abc"]]}}))

(defn bad []
  (excel/render-to-file "resources/template.xlsx"
                        "test-bad.xlsx"
                        {"Sheet1" {0 [["Column2"]]  ;; "Column2" is the problem!
                                   1 [["abc"]]}}))
