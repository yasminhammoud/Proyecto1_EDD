/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas;

/**
 *
 * @author fidel
 */
public class Actor {
    
    private Actor pNext;
    private String sIdActor;
    private String sNombre;
    private String sNacimiento;
    
    public Actor() {
        
    }
    
    public Actor(String sIdActor, String sNombre, String sNacimiento) {
        this.sIdActor = sIdActor;
        this.sNombre = sNombre;
        this.sNacimiento = sNacimiento;
        this.pNext = null;
    }

    /**
     * @return the pNext
     */
    public Actor getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Actor pNext) {
        this.pNext = pNext;
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
