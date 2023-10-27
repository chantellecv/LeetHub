class NumMatrix {

    int[][] data;
    public NumMatrix(int[][] matrix) {
        data = new int[matrix.length + 1][matrix[0].length + 1];
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[0].length; c++){
                data[r+1][c+1] = data[r][c+1] + data[r+1][c] - data[r][c] + matrix[r][c];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = data[row2+1][col2+1] - data[row2+1][col1] - data[row1][col2+1] + data[row1][col1];
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
