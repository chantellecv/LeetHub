class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int orig = image[sr][sc];
        if (orig != color) dfs (image, sr, sc, orig, color);
        return image;
    }

    public void dfs (int[][] image, int sr, int sc, int color, int newColor){
        
        if (image[sr][sc] == color ){
            image[sr][sc] = newColor;

            if (sc < image[0].length-1 && image[sr][sc+1] == color){
                dfs(image, sr, sc+1, color, newColor);
            }
            if (sc > 0 && image[sr][sc-1] == color){
                dfs(image, sr, sc-1, color, newColor);
            }
            if (sr < image.length-1 && image[sr+1][sc] == color){
                dfs(image, sr+1, sc, color, newColor);
            }
            if (sr > 0 && image[sr-1][sc] == color){
                dfs(image, sr-1, sc, color, newColor);
            }
        }       
    }
}
