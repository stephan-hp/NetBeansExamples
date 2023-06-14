package Clases;

import Ventanas.Ventana;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Farmacia {
    
        public ArrayList<Estante> DVD_list;
        private int DVD_c;

    public int getDVD_c() {
        return DVD_c;
    }

    public Farmacia(int cant) {
        DVD_list = new ArrayList();
        DVD_c=0;
    }
    
    public int Add(Estante d){
        
        this.DVD_list.add(d);
        DVD_c = this.DVD_list.size();
        return this.DVD_list.size() - 1;
        
    }
        
    public void Delete(Double index){
        int i = (int) (index + 0);
         Estante remove = this.DVD_list.remove(i - 1);
        }
        
    public void Save() throws IOException {       
                try 
            (ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream("Datos.dat"))) {
            out.writeObject(this.DVD_list);
           }   
        }

    public ArrayList<Estante> Importar() throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("Datos.dat"))) {
            return ( ArrayList<Estante> ) in.readObject();
    }            
  }
    

    
    }