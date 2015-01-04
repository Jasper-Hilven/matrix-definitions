[:create_vector
[:VectorElementDescription
 :i [:GetIteratorOverDimension :..] [:GetElementAt :.. :i]  ] ]
[:create_matrix
[:MatrixElementDescription
 :i0 [:GetIteratorOverDimension :..] :i1 [:GetIteratorOverDimension :v]
 [:GetElementAt [:GetElementAt :.. :i0] :i1]  ] ]



[:fill_vector
  [:VectorElementDescription
   :i [:GetIteratorFromScalar :d]
  :fillnumber
  ]]
[:fill_matrix
  [:MatrixElementDescription  :i0 [:GetIteratorFromScalar :d0] :i1 [:GetIteratorFromScalar :d1]
   :fillnumber]]
[:create_unity_matrix
  [:MatrixElementDescription :i0 [:GetIteratorFromScalar :d] :i1 [:GetIteratorFromScalar :d]
    [:if [:= i0 i1] 1 0]]]
[:vector_to_row_matrix
 [:MatrixElementDescription
  :d0
  [:GetIteratorOverDimension :v]
  :d1
  [:first-dim-iterator]
  [:GetElementAt :v :d1]]]

[:vector_to_column_matrix
 [:MatrixElementDescription
  :d0
  [:first-dim-iterator]
  :d1
  [:GetIteratorOverDimension :v]
  [:GetElementAt :v :d0]]]
