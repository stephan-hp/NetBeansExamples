package CLASES;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *  Stephan Herrera
 */
public class Discos implements Serializable {
    protected String code,name;
    protected String DVDNAME;
    protected String date; // Date contains format DD/MM/YYYY
    protected int Files_c=0;
    public ArrayList<Archivo> Files_list;
    
    public Discos(String code, String date) {
        this.code = code;
        this.date = date;
        DVDNAME = code;
        Files_c=0;
        Files_list=new ArrayList();
    }
    public void AddFile(Archivo f){
        this.Files_list.add(f);
        Files_c++;
    }
    public void DeleteFile(int index){
        
        this.Files_list.remove(index);
        Files_c--;
        
        }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public boolean getDatesByDate(String Date , Double Days){ //  DD/MM/YYYY
       int dates=0,dates_rev=0;
       Double k = Double.valueOf(Date.substring(0, 3));
       dates = (int) (Days + 0);
       dates_rev = (int) (k + 0);
       
      if ( this.date.substring(4, 9).equals(Date.substring(4, 9)) && dates - 5 < dates_rev && dates + 5 > dates_rev ){
          return true;
      }
       return false;
    }
}