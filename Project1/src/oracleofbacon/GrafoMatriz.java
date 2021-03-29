/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleofbacon;

import Primitivas.ListaSimple;
import Primitivas.NodoSimple;
import javax.swing.JOptionPane;


// *********** EQUIPO *********** FIDEL BARREAT - ALEJANDRO GUZMAN - YASMIN HAMMOUD
public class GrafoMatriz {

    Pelicula[] oPeliculas;
    Actor[] oActores;
    String[][] oRelacion;
    ListaSimple[] duplas;
    int numVerts;
    static int maxVerts = 20;
    Vertice[] verts;
    private int[][] matAd;

    //Constructor
    public GrafoMatriz() {
        this(maxVerts);
    }

    public int[][] getMatAd() {
        return matAd;
    }

    
    public GrafoMatriz(int mx) {
        this.numVerts = 0;
    }

    public void crearGrafo() {
        String sActorId, sMovieId;
        int iActorIndex, iMovieIndex;

        if (this.matAd == null) {
            this.matAd = new int[this.oPeliculas.length][this.oPeliculas.length];
            this.verts = new Vertice[this.oActores.length];
            for (int i = 0; i < this.oPeliculas.length; i++) {
                for (int j = 0; i < this.oPeliculas.length; i++) {
                    this.matAd[i][j] = 0;
                }
            }
            this.numVerts = 0;
        }

        for (int i = 0; i < this.oRelacion.length; i++) {
            sActorId = this.oRelacion[i][0];
            sMovieId = this.oRelacion[i][1];

            iActorIndex = getActorIndexFromActorId(sActorId);
            iMovieIndex = getMovieIndexFromMovieId(sMovieId);

            if (iActorIndex >= 0 || iMovieIndex >= 0) {

                this.oPeliculas[iMovieIndex].agregarActor(sActorId);
                System.out.println(this.oPeliculas[iMovieIndex].getsTitle() + " se le agrego el actor " + sActorId);
                this.oActores[iActorIndex].annadirPelicula(sMovieId);
                System.out.println(this.oActores[iActorIndex].getsNombre() + " se le agrego la pelicula " + sMovieId);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }

        }
        
        crearVertices();
        crearArcos();
        for (int i = 0; i < this.matAd.length; i++) {
            for (int j = 0; j < this.matAd[i].length; j++) {
                System.out.print(this.matAd[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public void crearVertices() {
        for (int i = 0; i < this.oPeliculas.length; i++) {
            nuevoVertice(this.oPeliculas[i]);
        }
    }
    
    public void crearArcos() {
        Vertice[] verticesTemp = this.verts;
        String[] actorTemp1;
        for (int i = 0; i < this.verts.length; i++) {
            for (int j = 0; j < verticesTemp.length; j++) {
                if (this.verts[i] != null && verticesTemp[j] != null && !this.verts[i].getNombreVertice().equals(verticesTemp[j].getNombreVertice())) {
                    actorTemp1 = this.verts[i].getNombreVertice().split(",");
                    for (int k = 0; k < actorTemp1.length; k++) {
                        if (verticesTemp[j].getNombreVertice().contains(actorTemp1[k])) {
                            nuevoArco(this.verts[i].getNombreVertice(), verticesTemp[j].getNombreVertice(), this.verts[i].getPelicula());
                            System.out.println("hay un arco entre " + this.verts[i].getNombreVertice() + " y " + verticesTemp[j].getNombreVertice());
                            break;
                        }
                    }
                }
            }
        }
    }

    public int getActorIndexFromActorId(String sActorId) {
        for (int i = 0; i < this.oActores.length; i++) {
            if (this.oActores[i].getsIdActor().equals(sActorId)) {
                return i;
            }
        }
        return -1;
    }

    private int getMovieIndexFromMovieId(String sMovieId) {
        for (int i = 0; i < this.oPeliculas.length; i++) {
            if (this.oPeliculas[i].getSIdPelicula().equals(sMovieId)) {
                return i;
            }
        }
        return -1;
    }

    public void nuevoVertice(Pelicula pelicula) {
        ListaSimple actores = pelicula.getLsActores();
        String temp = "";
        NodoSimple pAux = actores.getpFirst();
        while (pAux != null) {
            temp += pAux.getsData() + ",";
            pAux = pAux.getpNext();
        }
        temp = temp.replaceFirst(".$","");
        //mochar coma
        System.out.println(temp);
        //boolean esta = numVertice(nom) >= 0;
            Vertice v = new Vertice(temp);
            v.setPelicula(pelicula.getSIdPelicula());
            v.asigVert(this.numVerts);
            this.verts[this.numVerts++] = v;
    }

    //busca el vértice en el array. Devuelve -1 si no lo encuentra:
    public int numVertice(String vs) {
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

    public void nuevoArco(String a, String b, String pelicula) {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        this.matAd[va][vb] = Integer.parseInt(pelicula);
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

    public String commonMovieID(ListaSimple actor1, ListaSimple actor2) {

        ListaSimple pelisActor1 = actor1;   // Lista enlazada  A (peliculas en la que participa el actor 1)

        ListaSimple pelisActor2 = actor2;  // Lista enlazada  B (peliculas en la que participa el actor 2)

        NodoSimple headActor1 = pelisActor1.getpFirst();
        NodoSimple headActor2 = pelisActor2.getpFirst();

        String movieInCommon = "";

        // Recorer lista A hasta el final
        while (headActor1 != null) {

            // Recorer lista B hasta el final
            while (headActor2 != null) {

                // if data is match then count increase 
                if (headActor1.getOData() == headActor2.getOData()) {
                    movieInCommon = headActor2.getsData();
                }

                // Cambiar apuntador al siguiente - Lista B 
                headActor2 = pelisActor2.getpFirst().getPNext();
            }

            // Cambiar apuntador al siguiente - Lista A
            headActor1 = pelisActor2.getpFirst().getPNext();

            // Inicializar el punto de inicio de la Lista B
            headActor2 = pelisActor2.getpFirst();
        }

        // retornar película en común
        return movieInCommon;
    }
    
    public int getNumVerts() {
        return numVerts;
    }

}
