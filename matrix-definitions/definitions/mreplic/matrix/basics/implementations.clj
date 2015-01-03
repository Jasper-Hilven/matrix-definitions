  [
   [:matrix_matrix_*
    [:MatrixElementDescription
     :d0
     [:GetIteratorOverDimension :A 0]
     :d1
     [:GetIteratorOverDimension :B 1]
     [:fold
      [:select
       :index
       [:GetIteratorOverDimension :A 1]
       [:*
         [:GetElementAt :A :d0 :index]
         [:GetElementAt :B :index  :d1]]]
      :+]]]
   [:matrix_vector_*
    [:VectorElementDescription
     :d0
     [:GetIteratorOverDimension :A 0]
     [:fold
      [:select
       :index
       [:GetIteratorOverDimension :A 1]
       [ :*
         [:GetElementAt :A :d0 :index]
         [:GetElementAt :B :index ]]]
      :+]]]

   [:matrix_matrix_+
    [:MatrixElementDescription
     :d0
     [:GetIteratorOverDimension :A 0]
     :d1
     [:GetIteratorOverDimension :A 1]
     [+
      [:GetElementAt :A :d0 :d1]
      [:GetElementAt :B :d0 :d1]]]]
   [:matrix_matrix_-
    [:MatrixElementDescription
     :d0
     [:GetIteratorOverDimension :A 0]
     :d1
     [:GetIteratorOverDimension :A 1]
     [-
      [:GetElementAt :A :d0 :d1]
      [:GetElementAt :B :d0 :d1]]]]
   [:matrix_scalar_*
    [:MatrixElementDescription
     :d0 [:GetIteratorOverDimension :A 0]
     :d1 [:GetIteratorOverDimension :A 1]
     [*
      [:GetElementAt :A :d0 :d1]
      :s]]]
  ]
