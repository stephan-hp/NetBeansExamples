package CLASES;

import java.io.Serializable;


public class Archivo_MP3 extends Archivo implements Serializable {

    private String Interpreter,song_name,DVD_Name;

    public Archivo_MP3(String Interpreter, String song_name, String DVD_Name, String name, 
            String file_date, String extension, double size) {
        super(name, file_date, extension, size);
        this.Interpreter = Interpreter;
        this.song_name = song_name;
        this.DVD_Name = DVD_Name;
    }

    public String getInterpreter() {
        return Interpreter;
    }
    public void setInterpreter(String Interpreter) {
        this.Interpreter = Interpreter;
    }
    public String getSong_name() {
        return song_name;
    }
    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }
    public String getDVD_Name() {
        return DVD_Name;
    }
    public void setDVD_Name(String DVD_Name) {
        this.DVD_Name = DVD_Name;
    }
    @Override
    public double File_Duration() {
        return  size / 10;
    }
}
