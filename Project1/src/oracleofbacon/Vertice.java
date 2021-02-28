/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

import Primitivas.Actor;

/**
 *
 * @author fidel
 */
public class Vertice {

    String nombreVertice;
    int numVertice;
    private Actor pFirst;//Apuntador al inicio
    private Actor pLast;//Apuntador al final
    private int iSize;

    public Vertice(String x) {
        this.nombreVertice = x;
        this.numVertice = -1;
        this.pFirst = null;
        this.pLast = null;
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
    
    //Pregunta si la lista tiene un elemento y devuelve si es cierto o falso
    public boolean esVacia() {
        return this.pFirst == null;
    }

    //Vacia la lista seteando los apuntadores a null y el tamanio a 0
    public void vaciarLista() {
        this.pFirst = null;
        this.pLast = null;
        this.iSize = 0;
    }
    
    //Aniade un elemento al final haciendo que el que estaba anteriormente en la cola ahora apunte a este nuevo elemento y este nuevo elemento apunte a null
    public void annadirAlFinal(String sIdActor, String sNombre, String sNacimiento) {
        Actor pNuevo = new Actor(sIdActor, sNombre, sNacimiento);
        if (this.esVacia()) {
            this.pFirst = this.pLast = pNuevo;
        } else {
            this.pLast.setpNext(pNuevo);
            this.pLast = pNuevo;
        }
        this.iSize++;
        this.nombreVertice += sIdActor + ",";
    }
    
    //Devuelve el siguiente elemento a partir de un nodo como parametro
    public Actor proximo(Actor pPosicion) {
        if (pPosicion.getpNext() != null) {// verifico que el nodo que se envio por parametro no apunte a vacio
            pPosicion = pPosicion.getpNext();
            return pPosicion;
        } else {// Si apunta a vacio devuelve null
            return null;
        }
    }

    //Devuelve el anterior elemento a partir de un nodo como parametro
    public Actor anterior(Actor pPosicion) {
        Actor pAux = this.getpFirst();// nodo pAuxiliar
        Actor pAnt = this.getpFirst();// nodo pAnterior al pAuxiliar

        //boolean encontrado = false;
        if (pAux == pPosicion) {
            return null;
        } else {
            while (pAux != null) { //&& encontrado == false) {
                pAux = this.proximo(pAux);
                if (pAux == pPosicion) {
                    //encontrado = true;
                    return pAnt;
                }
                //else {
                pAnt = this.proximo(pAnt);
                //}
            }
        }
        return null;
    }

    //Indica si un nodo esta presente en la lista o no
    public boolean contiene(Actor o) {
        return getIndex(o) >= 0;
    }

    //Indica si un elemento existe
    public boolean existe(String sIdActor) {
        Actor pAux = this.getpFirst();
        while (pAux != null) {
            if (pAux.getsIdActor().equals(sIdActor)) {
                return true;
            }
            pAux = this.proximo(pAux);
        }
        return false;
    }
    
    //Obtiene un nodo a partir de su posicion/indice
    public Actor getNodo(int iPos) {
        if (!this.esVacia() && iPos <= this.getiSize()) {
            Actor pAux = getpFirst();
            for (int i = 0; i < iPos; i++) {// se recorre hasta la posicion
                pAux = this.proximo(pAux);
            }
            return pAux;
        }
        return null;
    }

    //Obtiene el indice de un nodo y lo retorna
    public int getIndex(Actor pNodo) {
        if (!this.esVacia()) {
            Actor pAux = getpFirst();
            int iCont = 0;
            while (pAux != pNodo) {
                iCont++;
                pAux = proximo(pAux);
            }
            return iCont;
        }
        return -1;
    }

    /**
     * @return the pFirst
     */
    public Actor getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Actor pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Actor getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Actor pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the iSize
     */
    public int getiSize() {
        return iSize;
    }

    /**
     * @param iSize the iSize to set
     */
    public void setiSize(int iSize) {
        this.iSize = iSize;
    }
}