# matrix-definitions

Contains the 'mathematical description of matrix operations' according to Numerical Linear Algebra, Lloyd N. Trefethen, David Bau III. The

## Idea

Check whether it is possible to use code as data for matrix operations.

## Layout

An operation is described in 3 different files:
  * the definitions file, which contains the operation name, the arguments and a short description
  * the constraints file, which contains constraint information of each operation: for example, the size constraints of the input matrices.
  * the implementaion file, which contains a description of the operation in a lower abstraction level. This level is described in mreplic/matrix/elements.clj

## To do

* This is just code as data. Add clojure code that checks the correctness of the data.
  Eventually add code to generate code from this data.
