/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119911;

/**
 * 
 */

public class Country extends MusicGenre{
    
    private String artistName;
    
    @Override
    public String getArtistName(){
        return artistName;
    }
    
    @Override
    public void setArtistName(String artistName){
        this.artistName = artistName;
    }
}