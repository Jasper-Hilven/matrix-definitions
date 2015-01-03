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
