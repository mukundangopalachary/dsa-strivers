package com.strivers.graphs.shortest_path_algorithms;

public class FloydWarshallAlgorithm{
    int INF = (int) 1e8;

    public int[][] floydWarshallAlgorithm(int[][] matrix){
        
        if(matrix.length == 0) return matrix;

        int V = matrix.length;

        // intermediate        
        for(int k = 0; k < V; k++){

            //row
            for(int i = 0; i < V; i++){

                //col
                for(int j = 0; j < V; j++){

                    if(matrix[i][k] != INF && matrix[k][j] != INF){
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }

        return matrix;
    }
}
