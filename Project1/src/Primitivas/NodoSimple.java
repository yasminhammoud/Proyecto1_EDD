package Primitivas;

// *********** EQUIPO *********** FIDEL BARREAT - ALEJANDRO GUZMAN - YASMIN HAMMOUD
public class NodoSimple {

    private NodoSimple pNext;
    private String sData;

    public NodoSimple(String sData) {
        this.sData = sData;
        this.pNext = null;
    }

    public NodoSimple() {

    }

    /**
     * @return the pNext
     */
    public NodoSimple getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoSimple pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the data
     */
    public String getsData() {
        return sData;
    }

    /**
     * @param data the data to set
     */
    public void setsData(String sData) {
        this.sData = sData;
    }

    public boolean getOData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public NodoSimple getPNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
