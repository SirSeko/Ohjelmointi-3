/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3tehtavat;

/**
 *
 * @author s717467
 */
public class MathUtils {
    
    // Jos olio sisältää olion
    private Olio olio;
    
// !!! Oliot sisltävätä melkein aina muita olioita !!!
    
    
    // Jos Teos olio halutaan kloonata/kopioida
    public static Olio kopioiTeos(final olio t){
        final Olio teos = new Olio();
        olio.setNimi(t.getNimi());
        
        return teos;
    }
    
    public static int laskeYhteen(int i, int k){
    
        return i + k;
        
    }
    public static Opiskelija tarkastaOpiskelija(final Opiskelija o){ // final Opiskelija o <== on viittaus Olioon, sitä kannatta käyttää
        
        if (o.getEtunimi().trim().length() == 0) {
            o.setEtunimi("Ei löydy");
        }
        return o;
    }
    public static Opiskelija kopioiOpiskelija(final Opiskelija o){
        
        final Opiskelija o2 = new Opiskelija();
        o2.setEtunimi(o.getEtunimi());   //<=== !!! Ainut tapa kopioida Opiskelijan tiedot!! 
        o2.setSukunimi(o.getEtunimi());
        // Kopioidaan myös teos
        o2.setOlio(kopioiOlio(o.olio));
        
        
        return o2;
    }
    
    
}
