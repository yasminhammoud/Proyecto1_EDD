package logica.actores;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class LogicaActores {
    
    static Lista lista = new Lista();

    static void leer(){
       try {
      File movies = new File("movies.csv");
      File people = new File("people.csv");
      File stars = new File("stars.csv");
      Scanner myReadermovies = new Scanner(movies);
      Scanner myReaderpeople = new Scanner(people);
      Scanner myReaderstars= new Scanner(stars);
      
      myReadermovies.nextLine();
      myReaderpeople.nextLine();
      myReaderstars.nextLine();
      
      boolean moviesuna = false;
      boolean peopleuna = false;
      boolean starsuna = false;
      
      while(myReadermovies.hasNextLine()){
          String data = myReadermovies.nextLine();
          if (lista.headm == null) {
              moviesuna = true;
              lista.headm = new Lista.Movie(Integer.parseInt(data.split(",")[0]), data.split(",")[1],Integer.parseInt(data.split(",")[2]) );
              lista.tailm = new Lista.Movie(Integer.parseInt(data.split(",")[0]), data.split(",")[1],Integer.parseInt(data.split(",")[2]) );
              
          }else{
              
              if (moviesuna) {
                  moviesuna = false;
                  lista.tailm = new Lista.Movie(Integer.parseInt(data.split(",")[0]), data.split(",")[1],Integer.parseInt(data.split(",")[2]) );
                  lista.headm.next = lista.tailm;
                  
              }else{
                  lista.tailm.next = new Lista.Movie(Integer.parseInt(data.split(",")[0]), data.split(",")[1],Integer.parseInt(data.split(",")[2]) );
                  lista.tailm = lista.tailm.next;
                  
              }
          }
          
          
      }
      
      
      while(myReaderpeople.hasNextLine()){
          String data = myReaderpeople.nextLine();
          
          if (lista.headp == null) {
              peopleuna = true;
              lista.headp = new Lista.People(Integer.parseInt(data.split(",")[0]), data.split(",")[1],Integer.parseInt(data.split(",")[2]) );
              lista.tailp = new Lista.People(Integer.parseInt(data.split(",")[0]), data.split(",")[1],Integer.parseInt(data.split(",")[2]) );
              
          }else{
              
              if (peopleuna) {
                  peopleuna = false;
                  lista.tailp = new Lista.People(Integer.parseInt(data.split(",")[0]), data.split(",")[1],Integer.parseInt(data.split(",")[2]) );
                  lista.headp.next = lista.tailp;
                  
              }else{
                  lista.tailp.next = new Lista.People(Integer.parseInt(data.split(",")[0]), data.split(",")[1],Integer.parseInt(data.split(",")[2]) );
                  lista.tailp = lista.tailp.next;
                  
              }
          }
          
          
      }
      
      
      while(myReaderstars.hasNextLine()){
          String data = myReaderstars.nextLine();
          if (lista.heads == null) {
              starsuna = true;
              lista.heads = new Lista.Star(Integer.parseInt(data.split(",")[0]),Integer.parseInt(data.split(",")[1]) );
              lista.tails = new Lista.Star(Integer.parseInt(data.split(",")[0]),Integer.parseInt(data.split(",")[1]) );
              
          }else{
              
              if (starsuna) {
                  starsuna = false;
                  lista.tails = new Lista.Star(Integer.parseInt(data.split(",")[0]),Integer.parseInt(data.split(",")[1]) );
                  lista.heads.next = lista.tails;
                  
              }else{
                  lista.tails.next =new Lista.Star(Integer.parseInt(data.split(",")[0]),Integer.parseInt(data.split(",")[1]) );
                  lista.tails = lista.tails.next;
                  
              }
          }
          
          
      }
      
      
      
      myReadermovies.close();
      myReaderpeople.close();
      myReaderstars.close();
      
      
      
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    
    static void peliculasdeactor(int id_actor){
        Lista.People head_actor = lista.headp;
        boolean encontrado = false;
        while(head_actor!=null){
            
            if(head_actor.id == id_actor){
                encontrado = true;
                break;
            }
            head_actor = head_actor.next;
        }
        
        if (encontrado) {
            System.out.println(head_actor.name + ":");
            
            Lista.Star head_star = lista.heads;
            while(head_star!=null){
                
                if (head_star.person_id == id_actor) {
                    int movieid = head_star.movie_id;
                    Lista.Movie head_movie = lista.headm;
                    
                    while(head_movie!=null){
                        
                        if (head_movie.id==movieid) {
                            System.out.println(head_movie.title);
                        }
                        
                        head_movie = head_movie.next;
                    }
                    
                }
                
                head_star = head_star.next;
                
                
            }
            
            
            
        }else{
            System.out.println("Actor no encontrado");
        }
    }
    
    
    public static void main(String[] args) {
        leer();
        //System.out.println(lista.headp.id);
        peliculasdeactor(1000);
        peliculasdeactor(102);
        peliculasdeactor(420);
    }
    
}

