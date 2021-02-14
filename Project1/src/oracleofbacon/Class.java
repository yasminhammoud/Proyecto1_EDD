
package oracleofbacon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Class {
    
    public static void main(String[]args){
       
        File archivoSeleccionado;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*CSV" , "csv");
        seleccionarArchivo.setFileFilter(filtro);
        seleccionarArchivo.showOpenDialog(null);
        archivoSeleccionado = seleccionarArchivo.getSelectedFile();
        
        try{
           
           FileReader fr = new FileReader(archivoSeleccionado);
           BufferedReader br = new BufferedReader(fr);
           String cadena;
           Object[] elemento = new Object[3];
           
           while((cadena = br.readLine())!= null)
           {
               String registro[] = cadena.split(",");
               elemento[0] = registro[0];
               elemento[1] = registro[1];
               elemento[2] = registro[2];
               System.out.println(elemento[1]);
               
           }
           
       }catch(Exception ex){
       
       }
    
}
}
