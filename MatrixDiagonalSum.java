
//   MatrixDiagonalSum
//   1    1   1   1
//   1    1   1   1
//   1    1   1   1
//   1    1   1   1

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[mat.length - i - 1][i];
        }
        return mat.length % 2 == 0 ? sum : sum - mat[mat.length / 2][mat.length / 2];
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        System.out.println(diagonalSum(mat));
    }
}