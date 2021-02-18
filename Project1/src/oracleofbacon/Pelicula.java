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
public class Pelicula {
    
    public String sIdPelicula;
    public String sTitle;
    public String sLanzamiento;
    
    public Pelicula() {
        
    }
    
    public Pelicula(String sIdPelicula, String sTitle, String sLanzamiento) {
        this.sIdPelicula = sIdPelicula;
        this.sTitle = sTitle;
        this.sLanzamiento = sLanzamiento;
    }
}
