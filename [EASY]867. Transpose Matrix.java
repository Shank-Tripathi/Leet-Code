The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109

Interview Followup-
https://leetcode.com/problems/transpose-matrix/discuss/2100127/Interview-Follow-Up%3A-Square-Matrix

CODE
====

class Solution {
    public int[][] transpose(int[][] matrix) {
    
        int r=matrix.length;      //row
        int c=matrix[0].length;   //column
        int[][] transpose = new int[c][r];  //creating new matrix => rows=cols of the old matrix and columns= rows of old matrix
    
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]=matrix[i][j]; 
                // we are iterating normallt over the old matrix and while storing we are making sure that we have copied the value into the transpose cell
            }
        }
        
        return transpose;
    }
}
