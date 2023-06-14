package CLASES;

import java.io.Serializable;

public abstract class Archivo implements Serializable {
    
    protected String file_name,file_date,extension;
    protected double size;

    public Archivo(String name, String file_date, String extension, double size) {
        this.file_name = name;
        this.file_date = file_date;
        this.extension = extension;
        this.size = size;
    }
    public String getFile_Name() {
        return file_name;
    }
    public void setFile_Name(String name) {
        this.file_name = name;
    }
    public String getFile_date() {
        return file_date;
    }
    public void setFile_date(String file_date) {
        this.file_date = file_date;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
 
    public abstract double File_Duration();

}
