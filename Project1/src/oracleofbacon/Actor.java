/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

import Primitivas.ListaSimple;


// *********** EQUIPO *********** FIDEL BARREAT - ALEJANDRO GUZMAN - YASMIN HAMMOUD
public class Actor {

    private String sIdActor;
    private String sNombre;
    private String sNacimiento;
    ListaSimple lsMovies;

    public Actor() {

    }

    public Actor(String sIdActor, String sNombre, String sNacimiento) {
        this.sIdActor = sIdActor;
        this.sNombre = sNombre;
        this.sNacimiento = sNacimiento;
        this.lsMovies = new ListaSimple();
    }

    public void annadirPelicula(String sIdMovie) {
        lsMovies.annadirAlFinal(sIdMovie);
    }

    public boolean haceParteDe(String sIdMovie) {
        return lsMovies.contiene(sIdMovie);
    }

    public String[] getIDsMovies() {
        //Esta funcion devuelve un array con los id de las peliculas
        String moviesArray[] = new String[lsMovies.getiSize()];

        for (int i = 0; i < lsMovies.getiSize(); i++) moviesArray[i] = lsMovies.leer(i);
        
        return moviesArray;
    }

    /**
     * @return the sIdActor
     */
    public String getsIdActor() {
        return sIdActor;
    }

    /**
     * @param sIdActor the sIdActor to set
     */
    public void setsIdActor(String sIdActor) {
        this.sIdActor = sIdActor;
    }

    /**
     * @return the sNombre
     */
    public String getsNombre() {
        return sNombre;
    }

    /**
     * @param sNombre the sNombre to set
     */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /**
     * @return the sNacimiento
     */
    public String getsNacimiento() {
        return sNacimiento;
    }

    /**
     * @param sNacimiento the sNacimiento to set
     */
    public void setsNacimiento(String sNacimiento) {
        this.sNacimiento = sNacimiento;
    }
}