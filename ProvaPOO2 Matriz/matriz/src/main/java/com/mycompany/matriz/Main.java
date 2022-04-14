package com.mycompany.matriz;

public class Main {
    public static void main(String args[]) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] soma = {{9,8,7},{6,5,4},{3,2,1}};

        Matriz matriz = new Matriz(mat);
        matriz.SomarMatrizes(soma);
    }
}
