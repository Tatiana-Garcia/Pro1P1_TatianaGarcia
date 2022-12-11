/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p1_tatianagarcia;

/**
 *
 * @author tatig
 */
public class Cancion {

    
    private String song_name; 
    private String song_album;
    private String song_artist; 
    private int song_year; 
    private int song_seconds; 
    
    public Cancion(String name, String album, String artist, int year, int sec)
    {
        song_name = name; 
        song_album = album;
        song_artist = artist;
        song_year = year;
        song_seconds = sec;
    }
    /**
     * @return the song_name
     */
    public String getSong_name() { 
        return song_name;
    }

    /**
     * @param song_name the song_name to set
     */
    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    /**
     * @return the song_album
     */
    public String getSong_album() {
        return song_album;
    }

    /**
     * @param song_album the song_album to set
     */
    public void setSong_album(String song_album) {
        this.song_album = song_album;
    }

    /**
     * @return the song_artist
     */
    public String getSong_artist() {
        return song_artist;
    }

    /**
     * @param song_artist the song_artist to set
     */
    public void setSong_artist(String song_artist) {
        this.song_artist = song_artist;
    }

    /**
     * @return the song_year
     */
    public int getSong_year() {
        return song_year;
    }

    /**
     * @param song_year the song_year to set
     */
    public void setSong_year(int song_year) {
        this.song_year = song_year;
    }

    /**
     * @return the song_seconds
     */
    public int getSong_seconds() {
        return song_seconds;
    }

    /**
     * @param song_seconds the song_seconds to set
     */
    public void setSong_seconds(int song_seconds) {
        this.song_seconds = song_seconds;
    }
    
    public String toString()
    {
        String cadena=""; 
        return cadena;
    }
}
