# ComplementaryArray

## Task description

A non-empty array A consisting of N integers is given. A pair of integers (P, Q) is called K-complementary in array A if 0 ≤ P, Q < N and A[P] + A[Q] = K.

For example, consider array A such that:

 A[0] = 1 A[1] = 8 A[2]= -3
 A[3] = 0 A[4] = 1 A[5]= 3
 A[6] = -2 A[7] = 4 A[8]= 5
 
The following pairs are 6-complementary in array A: (0,8), (1,6), (4,8), (5,5), (6,1), (8,0), (8,4). For instance, the pair (4,8) is 6-complementary because 

A[4] + A[8] = 1 + 5 = 6.

Write a function:

> class Solution { public int solution(int K, int[] A); }

that, given an integer K and a non-empty array A consisting of N integers, returns the number of K-complementary pairs in array A.

For example, given K = 6 and array A such that:

 A[0] = 1 A[1] = 8 A[2]= -3
 A[3] = 0 A[4] = 1 A[5]= 3
 A[6] = -2 A[7] = 4 A[8]= 5
 
the function should return 7, as explained above.

Write an ecient algorithm for the following assumptions:

 - N is an integer within the range [1..40,000];
 - K is an integer within the range [−2,147,483,648..2,147,483,647];
 - each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
