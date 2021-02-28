/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

import Primitivas.ListaSimple;

/**
 *
 * @author fidel
 */
public class Pelicula {

    private String sIdPelicula;
    private String sTitle;
    private String sLanzamiento;
    private ListaSimple lsActores;

    public Pelicula(String sIdPelicula, String sTitle, String sLanzamiento) {
        this.sIdPelicula = sIdPelicula;
        this.sTitle = sTitle;
        this.sLanzamiento = sLanzamiento;
        lsActores = new ListaSimple();
    }

    public String[] getCast() {
        String actoresArray[] = new String[this.lsActores.getiSize()];

        for (int i = 0; i < this.lsActores.getiSize(); i++) actoresArray[i] = this.lsActores.leer(i);
        
        return actoresArray;
    }

    public void agregarActor(String IdActor) {
        lsActores.annadirAlFinal(IdActor);
    }

    public String getSIdPelicula() {
        return this.sIdPelicula;
    }

    public String getsTitle() {
        return this.sTitle;
    }

    public boolean partOfMovie(String actorID) {
        return lsActores.contiene(actorID);

    }

}
