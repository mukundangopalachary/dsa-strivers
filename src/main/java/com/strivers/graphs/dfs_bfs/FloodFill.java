package com.strivers.graphs.dfs_bfs;

public class FloodFill {

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int org = image[sr][sc];
    if (color == org) return image;
    image[sr][sc] = color;
    dfs(sr, sc, image, color, org);

    return image;
  }

  private void dfs(int i, int j, int[][] image, int color, int org) {

    if (i > 0 && image[i - 1][j] == org) {
      image[i - 1][j] = color;
      dfs(i - 1, j, image, color, org);
    }

    if (i < image.length - 1 && image[i + 1][j] == org) {
      image[i + 1][j] = color;
      dfs(i + 1, j, image, color, org);
    }

    if (j > 0 && image[i][j - 1] == org) {
      image[i][j - 1] = color;
      dfs(i, j - 1, image, color, org);
    }

    if (j < image[0].length - 1 && image[i][j + 1] == org) {
      image[i][j + 1] = color;
      dfs(i, j + 1, image, color, org);
    }

    return;
  }
}
