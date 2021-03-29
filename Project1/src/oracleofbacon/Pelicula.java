/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

import Primitivas.ListaSimple;


// *********** EQUIPO *********** FIDEL BARREAT - ALEJANDRO GUZMAN - YASMIN HAMMOUD
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
        String actoresArray[] = new String[this.getLsActores().getiSize()];

        for (int i = 0; i < this.getLsActores().getiSize(); i++) actoresArray[i] = this.getLsActores().leer(i);
        
        return actoresArray;
    }

    public void agregarActor(String IdActor) {
        getLsActores().annadirAlFinal(IdActor);
    }

    public String getSIdPelicula() {
        return this.sIdPelicula;
    }

    public String getsTitle() {
        return this.sTitle;
    }

    public boolean partOfMovie(String actorID) {
        return getLsActores().contiene(actorID);

    }
    
    /**
     * @return the lsActores
     */
    public ListaSimple getLsActores() {
        return lsActores;
    }

    /**
     * @param lsActores the lsActores to set
     */
    public void setLsActores(ListaSimple lsActores) {
        this.lsActores = lsActores;
    }


}
