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
public class Actor {
    
    public String sIdActor;
    public String sNombre;
    public String sNacimiento;
    
    public Actor() {
        
    }
    
    public Actor(String sIdActor, String sNombre, String sNacimiento) {
        this.sIdActor = sIdActor;
        this.sNombre = sNombre;
        this.sNacimiento = sNacimiento;
    }
}
