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
public class Actores {
    private Actor pFirst;//Apuntador al inicio
    private Actor pLast;//Apuntador al final
    private int iSize;

    public Actores() {
        this.pFirst = null;
        this.pLast = null;
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

    //Devuelve la data de un nodo
//    public String leer(Actor pValor, String sTitle) {
//        switch(sTitle) {
//            case "I": return pValor.getsIdActor();
//            case "N": return pValor.getsNombre();
//            case "B": return pValor.getsNacimiento();
//            default: return "-1";
//        }
//    }

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
    }

    //Aniade un elemento al inicio 
//    public void annadirAlInicio(Object oElemento) {
//        Actor pNuevo = new Actor(oElemento);
//        if (this.esVacia()) {
//            this.setpFirst(this.pLast = pNuevo);
//        } else {
//            pNuevo.setpNext(this.getpFirst());
//            this.setpFirst(pNuevo);
//        }
//        this.setiSize(this.getiSize() + 1);
//    }

//    public void eliminarAlInicio() {
//        this.setpFirst(this.getpFirst().getpNext());
//    }
//
//    public void eliminarAlFinal() {
//        if (!this.esVacia()) {
//
//            Actor pActual = this.getpFirst();
//            Actor pPrev = this.getpFirst();
//            for (int i = 0; i < this.getiSize(); i++) {
//                if (pActual != null) {
//                    pPrev = pActual;
//                    pActual = pActual.getpNext();
//                }
//            }
//            this.setpLast(pPrev);
//        }
//    }

    //Imprime cada elemento de la lista en una nueva linea
//    public String imprimirLista() {
//        String sListaCompleta = "";
//        Actor pActual = this.getpFirst();
//        while (pActual != null) {
//            sListaCompleta += pActual.getOData() + "\n";
//            pActual = pActual.getpNext();
//        }
//        return sListaCompleta;
//    }

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

//    public void reverso() {
//        if (!this.esVacia()) {
//            Object oData = this.getpFirst().getOData();
//            this.reverso();
//            this.annadirAlFinal(oData);
//        }
//    }

//    public void removerRepetidos() {
//        if (!this.esVacia()) {
//            Object oData = this.getpFirst().getOData();
//            this.eliminarAlInicio();
//            this.removerRepetidos();
//            if (!this.existe(oData)) {
//                this.annadirAlInicio(oData);
//            }
//        }
//    }

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
