package com.mycompany.matriz;

public class Matriz {
    private int[][] matriz;

    public Matriz(int[][] matriz) {
        this.setMatriz(matriz);
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    public int[][] MatrizOposta() {
        int[][] temp = this.matriz;
        for(int indice = 0; indice < temp.length; indice++) {
            for(int indice2 = 0; indice2 < temp[indice].length; indice2++){
                temp[indice][indice2] = temp[indice][indice2] * -1;
            }
        }
        return temp;
    }
    
    public int[][] MatrizNula() {
        int[][] temp = {{0,0,0},{0,0,0},{0,0,0}};
        return temp;
    }
    
    public void Identidade() {
        int colunas = 0;
        int linhas = 0;
        boolean identidade = true;
        
        for(int indice = 0; indice < this.matriz.length; indice++) {
            colunas = colunas + 1;
            for(int indice2 = 0; indice2 < this.matriz[indice].length; indice2++){
                linhas = linhas + 1;
                this.matriz[indice][indice2] = this.matriz[indice][indice2] + matriz[indice][indice2];
                if(indice == indice2 && this.matriz[indice][indice2] != 1) {
                    identidade = false;
                }
                if(indice != indice2 && this.matriz[indice][indice2] != 0) {
                    identidade = false;
                }
            }
        }
        if(colunas != linhas) {
            identidade = false;
        }
        
        if(identidade) {
            System.out.println("é uma matriz identidade");
        }
        else {
            System.out.println("não é uma matriz identidade");
        }
    }

    public void SomarMatrizes(int[][] matriz) {
        if(this.matriz.length != matriz.length ){
            return;
        }
        
        for(int indice = 0; indice < this.matriz.length; indice++) {
            for(int indice2 = 0; indice2 < this.matriz[indice].length; indice2++){
                this.matriz[indice][indice2] = this.matriz[indice][indice2] + matriz[indice][indice2];
            }
        }
    }
}
