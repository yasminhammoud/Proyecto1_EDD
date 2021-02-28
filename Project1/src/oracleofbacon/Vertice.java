/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

/**
 *
 * @author fidel
 */
public class Vertice {

    String nombreVertice;
    int numVertice;

    public Vertice(String x) {
        this.nombreVertice = x;
        this.numVertice = -1;
    }

    public String nomVertice() // devuelve identificador del vértice
    {
        return this.nombreVertice;
    }

    public boolean equals(Vertice n) // true, si dos vértices son iguales
    {
        return this.nombreVertice.equals(n.nombreVertice);
    }

    public void asigVert(int n) // establece el número de vértices
    {
        this.numVertice = n;
    }

    public String toString() // características del vértice
    {
        return this.nombreVertice + " (" + this.numVertice + ")";
    }
    
}
