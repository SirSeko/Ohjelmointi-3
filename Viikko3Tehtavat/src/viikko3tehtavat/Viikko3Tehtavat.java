/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3tehtavat;


// import tehtava.Opiskelija;
/**
 *
 * @author s717467
 */
public class Viikko3Tehtavat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // MatUtils math = new MathUtils(); <== Jos metodi ei olisi staattinen jouduttaisiin alustamaan se näin
                                                // Tämä ei ole väärin mutta saattaa aiheuttaa virheitä.
        MathUtils.laskeYhteen(4, 5); // <=== Koska metodi on staattinen, tämä riittää
                                       // !!! Muista kutsua luokkaa MathUtils. . !! 
        
        // Oletetaan että tuodaan Opiskelija class tänne niin:                               
        // Opiskelija o = new Opiskelija(); 
        MathUtils.tarkastaOpiskelija(o);
        
        
        // Opiskelija k = o; <== Opiskelijan kopiointi ei näin onnistu
        Opiskelija k = MathUtils.kopioiOpiskelija(o);
        
        // Olioiden vertailua 
        o.equals(k); <=== Jos toinen olio on täysin sama kuin toinen niin tämä toimii
        // Mutta käytännössä oliot on hyvin harvoin samoja
        // if (o == k) <==== !! ei toimi!!
        
        
        
        
    }
    
}
