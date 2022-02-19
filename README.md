The repository contains a file with code and a file with tests.
***
Below is a list of methods and the tasks they solve:

1.  sum(int x, int y) 
    > Returns the sum of the numbers x and y.
2.  mul(int x, int y) 
    > Returns the product of the numbers x and y.
3.  div(int x, int y) 
    > Returns the quotient of the division of the numbers x and y. It is guaranteed that y != 0.
4.  mod(int x, int y) 
    > Returns the remainder of the division of the numbers x and y. It is guaranteed that y != 0.
5.  isEqual(int x, int y) 
    > Returns true if x is equal to y, otherwise false.
6.  isGreater(int x, int y) 
    > Returns true if x is greater than y, otherwise false.
7.  isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y)    
    > A rectangle with horizontal and vertical side is defined by two points - the upper left (xLeft, yTop) and the lower right (xRight, yBottom). On the OXY plane, the X-axis is directed to the right, the Y-axis is down. Another point with is given        coordinates (x, y). It is guaranteed that xLeft < xRight and yTop < yBottom. The method should return true if the point lies inside the rectangle , otherwise false. If a point lies on the border of a rectangle, then it is assumed that it lies inside him.
8. sum(int[] array)
    > Returns the sum of the numbers specified by the one-dimensional array. Returns 0 for an empty one-dimensional array.
9. mul(int[] array)
    > Returns the product of the numbers specified by the one-dimensional array. Returns 0 for an empty one-dimensional array.
10. min(int[] array)
    > Returns the minimum of the numbers specified by the one-dimensional array. For an empty one-dimensional array, returns Integer.MAX_VALUE.
11. max(int[] array)
    > Returns the maximum of the numbers specified by the one-dimensional array. For an empty one-dimensional array, returns Integer.MIN_VALUE.
12. average(int[] array)
    > Returns the average value for the numbers specified by the one-dimensional array. For an empty one-dimensional array returns 0.
13. isSortedDescendant(int[] array)
    > Returns true if the one-dimensional array is strictly ordered in descending order, otherwise false. Empty one-dimensional array it is considered ordered.
14. cube(int[] array)
    > Raises all elements of a one-dimensional array to the third power
15. find(int[] array, int value)
    > Returns true if there is an element equal to "value" in the one-dimensional array, otherwise false.
16. reverse(int[] array)
    > Flip a one-dimensional array, that is, swaps the 0th and last, 1st and penultimate, etc. elements.
17. isPalindrome(int[] array)
    > Returns true if the one-dimensional array is a palindrome, otherwise false. An empty array is considered a palindrome.
18. sum(int[][] matrix)
    > Returns the sum of the numbers specified by the two-dimensional array matrix.
19. max(int[][] matrix)
    > Returns the maximum of the numbers specified by the two-dimensional array matrix. For an empty two-dimensional array , returns Integer.MIN_VALUE.
20. diagonalMax(int[][] matrix)
    > Returns the maximum of the numbers located on the main diagonal of a square two-dimensional array matrix. For an empty two-dimensional array returns Integer.MIN_VALUE.
21. isSortedDescendant(int[][] matrix)
    > Returns true if all rows of the two-dimensional matrix array are strictly ordered in descending order, otherwise false. Empty the string is considered ordered. Different rows of the matrix array can have different numbers of elements. When writing it is recommended to call the method from clause 13 inside it.
