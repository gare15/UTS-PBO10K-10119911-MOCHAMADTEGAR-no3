/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119911;

/**
 *
 * @author 
 * Nama  : Mochamad Tegar
 * NIM   : 10119911
 * Kelas : IF 10K
 */
public class UTSno3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RnB genreblues = new RnB();
        genreblues.genreBlues("Jimmy Hendrik");
        RnB genrejazz = new RnB();
        genrejazz.genreJazz("Chad Baker");        
        Folk genrefolk = new Folk();
        genrefolk.genreFolk("Bob Dylan");        
        Rockability genrerockability = new Rockability();
        genrerockability.genreRockability("Elvis Presley");        
        HardRock genreprogressiveRock = new HardRock();
        genreprogressiveRock.genreProgressiveRock("DreamTheater");        
        HardRock genrepsycehedellic = new HardRock();
        genrepsycehedellic.genrePsycehedellic("The Doors");        
        HardRock genrepopRock = new HardRock();
        genrepopRock.genrePopRock("Kiss");       
        Metal genrepunk = new Metal();
        genrepunk.genrePunk("MXPX");       
        Metal genreheavyMetal = new Metal();
        genreheavyMetal.genreHeavyMetal("METALLICA");        
       Grindcore genregrindcore = new Grindcore();
        genregrindcore.genreGrindcore("Mesin Tempur");       
        DeathMetal genredeathMetal = new DeathMetal();
        genredeathMetal.genreDeathMetal("JASAD");      
        DeathCoreKepiting genreDeathCoreKepiting = new DeathCoreKepiting();
        genreDeathCoreKepiting.genreDeathCoreKepiting("Revenge The Fate");     
        BlackMetal genreBlackMetal = new BlackMetal();
        genreBlackMetal.genreBlackMetal("Behemoth");      
        NewSkul genreNewSkul = new NewSkul();
        genreNewSkul.genreNewSkul("HATEBREED");
    }
    
}
