/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko4tehtava1;

/**
 *
 * @author s717467
 */
public class Henkilokunta extends Henkilo {
    
    private String Tyontekijanumero;
    private String Toimipaikka;
    private String Titteli;
    
    public Henkilokunta(){
        
    }

    public Henkilokunta(String Tyontekijanumero, String Toimipaikka, String Titteli) {
        this.Tyontekijanumero = Tyontekijanumero;
        this.Toimipaikka = Toimipaikka;
        this.Titteli = Titteli;
    }

    public String getTyontekijanumero() {
        return Tyontekijanumero;
    }

    public void setTyontekijanumero(String Tyontekijanumero) {
        this.Tyontekijanumero = Tyontekijanumero;
    }

    public String getToimipaikka() {
        return Toimipaikka;
    }

    public void setToimipaikka(String Toimipaikka) {
        this.Toimipaikka = Toimipaikka;
    }

    public String getTitteli() {
        return Titteli;
    }

    public void setTitteli(String Titteli) {
        this.Titteli = Titteli;
    }
    public void tulostaHenkilokunta(){
        
        System.out.println(getHenkilonTiedot() + " " + this.Tyontekijanumero + " " + this.Toimipaikka
                + " " + this.Titteli);
        
    }        
}
