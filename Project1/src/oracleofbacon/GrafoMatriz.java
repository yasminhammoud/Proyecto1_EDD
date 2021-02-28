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
public class GrafoMatriz {

    Pelicula[] oPeliculas;
    Actor[] oActores;
    String[][] oRelacion;
    int numVerts;
    static int maxVerts = 20;
    Vertice[] verts;
    int[][] matAd;

    //Constructor
    public GrafoMatriz() {
        this(maxVerts);
    }

    public GrafoMatriz(int mx) {
        this.matAd = new int[mx][mx];
        this.verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                this.matAd[i][j] = 0;
            }
        }
        this.numVerts = 0;
    }

    public void crearGrafo() {
        if (this.matAd == null) {
            this.matAd = new int[this.oPeliculas.length][this.oPeliculas.length];
            this.verts = new Vertice[this.oPeliculas.length];
            for (int i = 0; i < this.oPeliculas.length; i++) {
                for (int j = 0; i < this.oPeliculas.length; i++) {
                    this.matAd[i][j] = 0;
                }
            }
            this.numVerts = 0;

            String[][] tempArray = this.oRelacion;
//        for (int i = 0; i < this.oRelacion.length; i++) {
//            String peliculaTemp = tempArray[i];
//        }
            while (tempArray.length > 0) {

            }
        }
    }

    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.asigVert(this.numVerts);
            this.verts[this.numVerts++] = v;
        }
    }

    //busca el vértice en el array. Devuelve -1 si no lo encuentra:
    int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < this.numVerts) && !encontrado;) {
            encontrado = this.verts[i].equals(v);
            if (!encontrado) {
                i++;
            }
        }
        return (i < this.numVerts) ? i : -1;
    }

    public void nuevoArco(String a, String b) throws Exception {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        this.matAd[va][vb] = 1;
    }

    //Determina si dos vertices forman un arco
    public boolean adyacente(String a, String b) throws Exception {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return this.matAd[va][vb] == 1;
    }

    //Determina si dos vertices forman un arco
    public boolean adyacente(int va, int vb) throws Exception {
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return this.matAd[va][vb] == 1;
    }

    public void addPeliculas(Pelicula[] oPeliculas) {
        this.oPeliculas = oPeliculas;
    }

    public void addActores(Actor[] oActores) {
        this.oActores = oActores;
    }

    public void addRelacion(String[][] oRelacion) {
        this.oRelacion = oRelacion;
    }

}
