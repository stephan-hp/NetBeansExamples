package CLASES;

import java.io.Serializable;


public class Archivo_MPEG extends Archivo implements Serializable {
    
    private String resolution;
    private boolean Is_movie;

    public Archivo_MPEG(String resolution, boolean Is_movie, String name, String file_date, 
        String extension, double size) {
        super(name, file_date, extension, size);
        this.resolution = resolution;
        this.Is_movie = Is_movie;
    }

    public String getResolution() {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public String isIs_movie() {
      if (this.Is_movie) return "Es una pelicula";
      else return "No es una pelicula";
    }
    public void setIs_movie(boolean Is_movie) {
        this.Is_movie = Is_movie;
    }
    public String getFile_name() {
        return file_name;
    }
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
    @Override
    public double File_Duration() {
        return size / 100;
    }
}
