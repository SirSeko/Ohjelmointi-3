/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko4tehtava1;
import java.util.Scanner;
/**
 *
 * @author s717467
 */
public class Henkilo {
    
    
    private String Nimi;
    private String Osoite;
    private String Syntymaaika;
  
    public Henkilo(){
        
    }
    
    public Henkilo(String Nimi, String Osoite, String Syntymaaika) {
        this.Nimi = Nimi;
        this.Osoite = Osoite;
        this.Syntymaaika = Syntymaaika;
    }

    public String getNimi() {
        return Nimi;
    }

    public void setNimi(String Nimi) {
        this.Nimi = Nimi;
    }

    public String getOsoite() {
        return Osoite;
    }

    public void setOsoite(String Osoite) {
        this.Osoite = Osoite;
    }

    public String getSyntymaaika() {
        return Syntymaaika;
    }

    public void setSyntymaaika(String Syntymaaika) {
        this.Syntymaaika = Syntymaaika;
    }
    
    protected String getHenkilonTiedot(){
        
        return Nimi + " " + Osoite + " " + Syntymaaika;
        
    }
   
    
}
