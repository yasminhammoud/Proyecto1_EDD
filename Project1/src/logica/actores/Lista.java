
package logica.actores;


public class Lista {
    
    Movie headm;
    Movie tailm;
    Star heads;
    Star tails;
    People headp;
    People tailp;


static class Movie { 
        int id;
        String title;
        int year;
        Movie next; 
        Movie(int idd,String titlee,int yearr) { id = idd; title = titlee; year=yearr; next=null; } 
    } 
    
    static class Star { 
        int person_id;
        int movie_id;
        Star next; 
        Star(int person_idd,int movie_idd) { person_id = person_idd; movie_id = movie_idd; next=null; } 
    } 
    
    static class People { 
        int id;
        String name;
        int birth;
        People next; 
        People(int idd,String namee,int birthh) { id = idd; name = namee; birth = birthh; next=null; } 
    } 
}
