package Primitivas;

public class ListaSimple {

    private NodoSimple pFirst;//Apuntador al inicio
    private NodoSimple pLast;//Apuntador al final
    private int iSize;

    public ListaSimple() {
        this.pFirst = this.pLast = null;
    }

    //Pregunta si la lista tiene un elemento y devuelve si es cierto o falso
    public boolean esVacia() {
        return this.pFirst == null;
    }

    //Vacia la lista seteando los apuntadores a null y el tamanio a 0
    public void vaciarLista() {
        this.pFirst = this.pLast = null;
        this.iSize = 0;
    }

    //Devuelve la data de un nodo
    public String leer(int pValor) {
      return getNodo(pValor).getsData();
    }

    //Aniade un elemento al final haciendo que el que estaba anteriormente en la cola ahora apunte a este nuevo elemento y este nuevo elemento apunte a null
    public void annadirAlFinal(String sData) {
        NodoSimple pNuevo = new NodoSimple(sData);
        if (this.esVacia()) {
            this.pFirst = this.pLast = pNuevo;
        } else {
            this.pLast.setpNext(pNuevo);
            this.pLast = pNuevo;
        }
        this.iSize++;
    }

    //Aniade un elemento al inicio 
    public void annadirAlInicio(String sData) {
        NodoSimple pNuevo = new NodoSimple(sData);
        if (this.esVacia()) {
            this.pFirst = this.pLast = pNuevo;
        } else {
            pNuevo.setpNext(this.pFirst);
            this.pFirst = pNuevo;
        }
        this.iSize++;
    }

    public void eliminarAlInicio() {
        this.pFirst = this.pFirst.getpNext();
    }

    public void eliminarAlFinal() {
        if (!this.esVacia()) {

            NodoSimple pActual = this.pFirst;
            NodoSimple pPrev = this.pFirst;
            for (int i = 0; i < this.iSize; i++) {
                if (pActual != null) {
                    pPrev = pActual;
                    pActual = pActual.getpNext();
                }
            }
            this.pLast = pPrev;
        }
    }

    //Imprime cada elemento de la lista en una nueva linea
    public String imprimirLista() {
        String sListaCompleta = "";
        NodoSimple pActual = this.pFirst;
        while (pActual != null) {
            sListaCompleta += pActual.getsData() + "\n";
            pActual = pActual.getpNext();
        }
        return sListaCompleta;
    }

    //Devuelve el siguiente elemento a partir de un nodo como parametro
    public NodoSimple proximo(NodoSimple pPosicion) {
        if (pPosicion.getpNext() != null) {// verifico que el nodo que se envio por parametro no apunte a vacio
            pPosicion = pPosicion.getpNext();
            return pPosicion;
        } else {// Si apunta a vacio devuelve null
            return null;
        }
    }

    //Devuelve el anterior elemento a partir de un nodo como parametro
    public NodoSimple anterior(NodoSimple pPosicion) {
        NodoSimple pAux = this.pFirst;// nodo pAuxiliar
        NodoSimple pAnt = this.pFirst;// nodo pAnterior al pAuxiliar

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
    public boolean contiene(NodoSimple o) {
        return getIndex(o) >= 0;
    }
    
    //Indica si un elemento esta presente en la lista o no
    public boolean contiene(String o) {
        return getIndex(o) >= 0;
    }

    //Indica si un elemento existe
    public boolean existe(String sData) {
        NodoSimple pAux = this.pFirst;
        while (pAux != null) {
            if (pAux.getsData().equals(sData)) {
                return true;
            }
            pAux = pAux.getpNext();
        }
        return false;
    }

    //Obtiene un nodo a partir de su posicion/indice
    public NodoSimple getNodo(int iPos) {
        if (!this.esVacia() && iPos <= this.iSize) {
            NodoSimple pAux = pFirst;
            for (int i = 0; i < iPos; i++) {// se recorre hasta la posicion
                pAux = this.proximo(pAux);
            }
            return pAux;
        }
        return null;
    }

    //Obtiene el indice de un nodo a partir de un nodo y lo retorna
    public int getIndex(NodoSimple pNodo) {
        if (!this.esVacia()) {
            NodoSimple pAux = pFirst;
            int iCont = 0;
            while (pAux != pNodo) {
                iCont++;
                pAux = proximo(pAux);
            }
            return iCont;
        }
        return -1;
    }
    
    //Obtiene el indice de un nodo a partir de un valor y lo retorna
    public int getIndex(String sData) {
        if (!this.esVacia()) {
            NodoSimple pAux = pFirst;
            int iCont = 0;
            while (pAux.getsData() != sData) {
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
    public NodoSimple getpFirst() {
        return this.pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoSimple pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoSimple getpLast() {
        return this.pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoSimple pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the iSize
     */
    public int getiSize() {
        return this.iSize;
    }

    /**
     * @param iSize the iSize to set
     */
    public void setiSize(int iSize) {
        this.iSize = iSize;
    }
}