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
public class Opiskelija extends Henkilo {
    private Integer OpiskelijaNumero;
    private String Aloituspaiva;
    
    public Opiskelija(){
        
    }
    
    public Opiskelija(Integer OpiskelijaNumero, String Aloituspaiva) {
        this.OpiskelijaNumero = OpiskelijaNumero;
        this.Aloituspaiva = Aloituspaiva;
    }
    

    public Integer getOpiskelijaNumero() {
        return OpiskelijaNumero;
    }

    public void setOpiskelijaNumero(Integer OpiskelijaNumero) {
        this.OpiskelijaNumero = OpiskelijaNumero;
    }

    public String getAloituspaiva() {
        return Aloituspaiva;
    }

    public void setAloituspaiva(String Aloituspaiva) {
        this.Aloituspaiva = Aloituspaiva;
    }
    
    
    public void tulostaOpiskelija(){
        
        System.out.println(getHenkilonTiedot() + " " + getOpiskelijaNumero() + " " + getAloituspaiva());
        
    }
    
 
    
    
    
    
}
