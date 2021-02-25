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
    public Object leer(NodoSimple pValor) {
        return pValor.getOData();
    }

    //Aniade un elemento al final haciendo que el que estaba anteriormente en la cola ahora apunte a este nuevo elemento y este nuevo elemento apunte a null
    public void annadirAlFinal(Object oElemento) {
        NodoSimple pNuevo = new NodoSimple(oElemento);
        if (this.esVacia()) {
            this.pFirst = this.pLast = pNuevo;
        } else {
            this.pLast.setPNext(pNuevo);
            this.pLast = pNuevo;
        }
        this.iSize++;
    }

    //Aniade un elemento al inicio 
    public void annadirAlInicio(Object oElemento) {
        NodoSimple pNuevo = new NodoSimple(oElemento);
        if (this.esVacia()) {
            this.pFirst = this.pLast = pNuevo;
        } else {
            pNuevo.setPNext(this.pFirst);
            this.pFirst = pNuevo;
        }
        this.iSize++;
    }

    public void eliminarAlInicio() {
        this.pFirst = this.pFirst.getPNext();
    }

    public void eliminarAlFinal() {
        if (!this.esVacia()) {

            NodoSimple pActual = this.pFirst;
            NodoSimple pPrev = this.pFirst;
            for (int i = 0; i < this.iSize; i++) {
                if (pActual != null) {
                    pPrev = pActual;
                    pActual = pActual.getPNext();
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
            sListaCompleta += pActual.getOData() + "\n";
            pActual = pActual.getPNext();
        }
        return sListaCompleta;
    }

    //Devuelve el siguiente elemento a partir de un nodo como parametro
    public NodoSimple proximo(NodoSimple pPosicion) {
        if (pPosicion.getPNext() != null) {// verifico que el nodo que se envio por parametro no apunte a vacio
            pPosicion = pPosicion.getPNext();
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

    //Indica si un elemento existe
    public boolean existe(Object oData) {
        NodoSimple pAux = this.pFirst;
        while (pAux != null) {
            if (pAux.getOData().equals(oData)) {
                return true;
            }
            pAux = pAux.getPNext();
        }
        return false;
    }

    public void reverso() {
        if (!this.esVacia()) {
            Object oData = this.pFirst.getOData();
            this.reverso();
            this.annadirAlFinal(oData);
        }
    }

    public void removerRepetidos() {
        if (!this.esVacia()) {
            Object oData = this.pFirst.getOData();
            this.eliminarAlInicio();
            this.removerRepetidos();
            if (!this.existe(oData)) {
                this.annadirAlInicio(oData);
            }
        }
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

    //Obtiene el indice de un nodo y lo retorna
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

    /**
     * @return the pFirst
     */
    public NodoSimple getPFirst() {
        return this.pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setPFirst(NodoSimple pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoSimple getPLast() {
        return this.pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setPLast(NodoSimple pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the iSize
     */
    public int getISize() {
        return this.iSize;
    }

    /**
     * @param iSize the iSize to set
     */
    public void setISize(int iSize) {
        this.iSize = iSize;
    }
}
