package CLASES;

import INTERFACES.Ventana_principal;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Clase_controladora implements Serializable {
    
        public ArrayList<Discos> DVD_list;
        private int DVD_c;

    public int getDVD_c() {
        return DVD_c;
    }

    public Clase_controladora(int cant) {
        DVD_list = new ArrayList();
        DVD_c=0;
    }
    
    public int AddDVD(Discos d){
        
        this.DVD_list.add(d);
        DVD_c = this.DVD_list.size();
        System.out.println("Done " + d.getDate() + "  " +  d.getCode() + ", DVD  Number " + this.DVD_list.size());
        return this.DVD_list.size() - 1;
        
    }
        
    public void DeleteDVD(Double index){
        int i = (int) (index + 0);
         Discos remove = this.DVD_list.remove(i - 1);
        }
        
    public void Save() throws IOException {       
                try 
            (ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream("Datos.dat"))) {
            out.writeObject(this.DVD_list);
           }   
        }

    public ArrayList<Discos> Importar() throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("Datos.dat"))) {
            Ventana_principal.add.emptylabel();
            return ( ArrayList<Discos> ) in.readObject();
    }            
  }
    
    public String LocateDVDformFilename(String NAME){
          for (int i=0; i < this.DVD_list.size() ;i++){
                for (int j=0 ; j < this.DVD_list.get(i).Files_list.size() ; j++){
              if (this.DVD_list.get(i).Files_list.get(j).getFile_Name().equals(NAME)) {
                  return "  " + this.DVD_list.get(i).getCode();
              }
          }
      }
 return "No encontrado";    
}

    public String LocateSongNamesByArtist(String Artist){
        String out="";
           for (int i=0; i < this.DVD_list.size() ;i++){
           for (int j=0 ; j < this.DVD_list.get(i).Files_list.size() ; j++){
                 if (this.DVD_list.get(i).Files_list.get(j) instanceof Archivo_MP3 ) {
                  if ( ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).getInterpreter().equals(Artist)){
                      out +=(" \nNombre del archivo: " + ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).file_name + ".mp3"
                                     + " \nDVD del archivo: " + this.DVD_list.get(i).getCode() );
                  }
                }
              }
          }
        
       if (out.equals("")) return "No encontrado";
       else return out;
}
    
    public String LocateFileNamesByDurationandExtension(double Duration, String Extension){
        String out="";
           for (int i=0; i < this.DVD_list.size() ;i++){
           for (int j=0 ; j < this.DVD_list.get(i).Files_list.size() ; j++){
                 if (this.DVD_list.get(i).Files_list.get(j) instanceof Archivo_MP3 ) {
                  if ( ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).File_Duration() > Duration ){
                      
                      out +=(" \n  Nombre del archivo: " + ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).file_name
                       +".mp3" );
                  }
                }
                 
                 if (this.DVD_list.get(i).Files_list.get(j) instanceof Archivo_MPEG ) {
                  if ( ((Archivo_MPEG) this.DVD_list.get(i).Files_list.get(j)).File_Duration() > Duration ){
                      
                      out +=(" \n  Nombre del archivo: " + ((Archivo_MPEG) this.DVD_list.get(i).Files_list.get(j)).file_name
                       +".mpeg" );
                  }
                }
              }
          }    
       if (out.equals("")) return "No encontrado";
       else return out;
       }
    
    public String LocateFileAtributesByDVDcode(String DVDcode){
           String out="";
           for (int i=0; i < this.DVD_list.size() ;i++){
                if (this.DVD_list.get(i).getCode().equals(DVDcode) ) {
                    
           for (int j=0 ; j < this.DVD_list.get(i).Files_list.size() ; j++){
                 if (this.DVD_list.get(i).Files_list.get(j) instanceof Archivo_MP3 ) {
                      out +=(  "-------- \n  Nombre del archivo: " + ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).file_name+".mp3"
                                      +" \n  Nombre del Interprete: " +  ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).getInterpreter()
                                      +" \n  Nombre de la cancion: " +  ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).getSong_name()
                                      +" \n  Titulo del Disco: " +  ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).getDVD_Name()
                                      +" \n  Duracion: " +  ((Archivo_MP3) this.DVD_list.get(i).Files_list.get(j)).File_Duration()
                              
                                 +"\n" );
                  }
             
                 if (this.DVD_list.get(i).Files_list.get(j) instanceof Archivo_MPEG ) {
                      out +=(  "-------- \n  Nombre del archivo: " + ((Archivo_MPEG) this.DVD_list.get(i).Files_list.get(j)).file_name+".mpeg"
                                     + " \n  " + ((Archivo_MPEG) this.DVD_list.get(i).Files_list.get(j)).isIs_movie()
                                     + " \n  Resolucion: " + ((Archivo_MPEG) this.DVD_list.get(i).Files_list.get(j)).getResolution()
                                     + " \n  Duracion: " +  ((Archivo_MPEG) this.DVD_list.get(i).Files_list.get(j)).File_Duration()
                    +"\n"  );
                }
                }
              }
          }
       if (out.equals("")) return "No encontrado";
       else return out;
       }
    
    public String LocateDVDByDateAndDays(String Date, double Days){  
        String out="";
        
           for (int i=0; i < this.DVD_list.size() ;i++){
             if (this.DVD_list.get(i).getDatesByDate(Date, Days)){
                 out +=("\n  Codigo del DVD: " + (this.DVD_list.get(i)).getCode()
                     );
               }
          }
       if (out.equals("")) return "No encontrado";
       else return out;
       }
    
    }