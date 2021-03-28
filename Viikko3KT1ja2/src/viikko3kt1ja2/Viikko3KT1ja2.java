/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3kt1ja2;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author s717467
 */
public class Viikko3KT1ja2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final ArrayList<Osake> osakeLista = new ArrayList<Osake>();
        Scanner input = new Scanner(System.in);
        
        int valinta = 0;
        Osake os = new Osake();
        while (true) {   
            
            os.tulostaValikko();
            valinta = input.nextInt();
            
            switch (valinta){
                case 0:
                    break;
                
                case 1:
                    os = new Osake();
                    os.kysyOsake();                      
                    osakeLista.add(os);
                    System.out.println("Osake lisätty");
                    break;
                    
                case 2:
                    os.tulostaArvo();
                    break;
                case 3:
                    //tulosta koko lista tuottoineen
                    for (Osake o : osakeLista) {
                        System.out.println(o.getNimi());
                        System.out.println(o.getProsentti()/100 * o.getOstohinta() + "€ tuottoa vuodessa");
                        System.out.println(o.getProsentti()/100 * o.getOstohinta() + o.getOstohinta() +"€ Tilillä ensimmäisen vuoden jälkeen");
                        System.out.printf("Säästämisen loppusumma = %.2f €", o.getOstohinta()* Math.pow(1+o.getProsentti()/100,o.getVuosi()));
                        System.out.println(System.getProperty("line.separator"));
                    }
                    break;
                    
                
                
            }
                    
            
            
        } 
        
    }
    
}
