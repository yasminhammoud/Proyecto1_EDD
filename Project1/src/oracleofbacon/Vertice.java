/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

// *********** EQUIPO *********** FIDEL BARREAT - ALEJANDRO GUZMAN - YASMIN HAMMOUD
public class Vertice {

    private String nombreVertice;
    private String pelicula;
    private int numVertice;

    public Vertice(String nombreVertice) {
        this.nombreVertice = nombreVertice;
        this.numVertice = -1;
    }

    public String nomVertice() // devuelve identificador del vértice
    {
        return this.getNombreVertice();
    }

    public boolean equals(Vertice n) // true, si dos vértices son iguales
    {
        return this.getNombreVertice().equals(n.getNombreVertice());
    }

    public void asigVert(int n) // establece el número de vértices
    {
        this.setNumVertice(n);
    }

    public String toString() // características del vértice
    {
        return this.getNombreVertice() + " (" + this.getNumVertice() + ")";
    }

    /**
     * @return the nombreVertice
     */
    public String getNombreVertice() {
        return nombreVertice;
    }

    /**
     * @param nombreVertice the nombreVertice to set
     */
    public void setNombreVertice(String nombreVertice) {
        this.nombreVertice = nombreVertice;
    }

    /**
     * @return the numVertice
     */
    public int getNumVertice() {
        return numVertice;
    }

    /**
     * @param numVertice the numVertice to set
     */
    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

    /**
     * @return the pelicula
     */
    public String getPelicula() {
        return pelicula;
    }

    /**
     * @param pelicula the pelicula to set
     */
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    
}
