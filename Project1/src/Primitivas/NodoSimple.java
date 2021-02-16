package Primitivas;

public class NodoSimple {
    private NodoSimple pNext;
    private Object oData;//strings y enteros
    
    public NodoSimple(Object oData) {
        this.oData = oData;
        this.pNext = null;
    }
    
    public NodoSimple() {
        
    }
    /**
     * @return the pNext
     */
    public NodoSimple getPNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setPNext(NodoSimple pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the data
     */
    public Object getOData() {
        return oData;
    }

    /**
     * @param data the data to set
     */
    public void setOData(Object data) {
        this.oData = data;
    }
    
    
}
