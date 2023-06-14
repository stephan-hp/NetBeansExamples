package Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *  
 */
public class Estante  {
    public ArrayList<medicamento> Files_list;
    
    public Estante() {
        Files_list=new ArrayList();
    }
    public void AddFile(medicamento f){
        this.Files_list.add(f);
    }
    public void DeleteFile(int index){
        
        this.Files_list.remove(index);
        
        
    }
}