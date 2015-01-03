   [:matrix_matrix_*
    [[:matrix :A]
     [:matrix :B]
     [:=
      [:dimension :A 1]
      [:dimension :B 0]]]]
   [:matrix_vector_*
    [[:matrix :A]
     [:matrix :v]
     [:=
      [:dimension :A 1]
      [:dimension :v]]]]

   [:matrix_matrix_+
    [[:matrix :A]
     [:matrix :B]
     [:=
      [:dimension :A 0]
      [:dimension :B 0]]
     [:=
      [:dimension :A 1]
      [:dimension :B 1]]]]

   [:matrix_matrix_-
    [[:matrix :A]
     [:matrix :B]
     [:=
      [:dimension :A 0]
      [:dimension :B 0]]
     [:=
      [:dimension :A 1]
      [:dimension :B 1]]]]
   [:matrix_scalar_*
    [[:matrix :A]]]])
