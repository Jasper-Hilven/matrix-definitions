 [
  [:MatrixElementDescription [ :firstParamName :firstDimDescription :secondParamName :secondDimDescription :Formula] ]
  [:VectorElementDescription [ :firstParamName :firstDimDescription :Formula] ]
  [:fold [:collection :operation]]
  [:select [:operatorName :collection :operation]]
  [:GetIteratorOverDimension [:Matrix :Dim]]
  [:GetIteratorOverDimension [:vector]]
  [:GetElementAt [:matrix :i0 :i1]]
  [:GetElementAt [:vector :i0]]
  [:+ [:s0 :s1]]
  [:* [:s0 :s1]]
  [:- [:s0 :s1]]
  [:first-dim-iterator]
  [:scalar_to_vector [:s]]]

;;constraints
(comment [[:matrix]
 [:vector]
 [:= :first :second]
 [:dimension :A :dir]
 [:dimension :v]
 []
 ])