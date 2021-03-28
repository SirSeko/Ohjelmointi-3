/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko4tehtava1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author s717467
 */
public class Viikko4Tehtava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final ArrayList<Henkilo> lista = new ArrayList<>();
        Opiskelija oo;
        Henkilokunta ho;
        
        final Scanner input = new Scanner(System.in);
        String jatketaanko;
        String valinta;
        
        do {            
            System.out.println(" Syötetäänkö uuden henkilön tiedot (k/e)");
            jatketaanko = input.nextLine();
            if (jatketaanko.equalsIgnoreCase("k")) {
                
                
                System.out.println("Onko henkilö opiskelija vai henkilökuntaa (o/h)?");
                valinta = input.nextLine();
                switch(valinta){
                    case "o":
                        oo = new Opiskelija();
                        System.out.println("Anna nimi: ");
                        oo.setNimi(input.nextLine());
                        System.out.println("Anna Osoite: ");
                        oo.setOsoite(input.nextLine());
                        System.out.println("Anna Syntyma-aika: ");
                        oo.setSyntymaaika(input.nextLine());
                        System.out.println("Anna Opiskelijanumero");
                        Integer opnr = Integer.parseInt(input.nextLine());
                        oo.setOpiskelijaNumero(opnr);
                        System.out.println("Anna Aloituspäivä");
                        oo.setAloituspaiva(input.nextLine());
                        lista.add(oo);
                        break;
                    case "h":
                        ho = new Henkilokunta();
                        System.out.println("Anna nimi: ");
                        ho.setNimi(input.nextLine());
                        System.out.println("Anna Osoite: ");
                        ho.setOsoite(input.nextLine());
                        System.out.println("Anna Syntyma-aika: ");
                        ho.setSyntymaaika(input.nextLine());
                        System.out.println("Anna Työntekijanumero");
                        ho.setTyontekijanumero(input.nextLine());
                        System.out.println("Anna Titteli");
                        ho.setTitteli(input.nextLine());
                        System.out.println("Anna Toimipaikka");
                        ho.setToimipaikka(input.nextLine());
                        lista.add(ho);
                        break;
                    default :
                        System.out.println("Annoit väärän kirjaimen");
                        break;
                }
            }
            
        } while (jatketaanko.equalsIgnoreCase("k"));
        for (Object henkilot : lista) {                                                        
           if (henkilot instanceof Opiskelija) {
              Opiskelija opiskelijat = (Opiskelija) henkilot;
              opiskelijat.tulostaOpiskelija();
            }
           else if (henkilot instanceof Henkilokunta) {
              Henkilokunta henkilokunta = (Henkilokunta) henkilot;
              henkilokunta.tulostaHenkilokunta();
            }
        }
        
        if (input != null) {
            input.close();
        }
                
    }
    
}
