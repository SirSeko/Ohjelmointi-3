/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko3kt1ja2;

import java.util.Scanner;


public class Osake {
   
    private String Nimi;
    private Double Ostohinta;
    private Double Prosentti;
    private Integer Vuosi;
    public Osake(){
        
        
    
    }
    public Osake(final String Nimi, final Double Ostohinta, final Double Prosentti, final Integer Vuosi){
        this.Nimi = Nimi;
        this.Ostohinta = Ostohinta;
        this.Prosentti = Prosentti;
        this.Vuosi = Vuosi;
    }

    public Integer getVuosi() {
        return Vuosi;
    }
    
    public Double getProsentti() {
        return Prosentti;
    }
    

    public String getNimi() {
        return Nimi;
    }

    public Double getOstohinta() {
        return Ostohinta;
    }

    public void setProsentti(Double Prosentti) {
        this.Prosentti = Prosentti;
    }
    
    public void setNimi(String Nimi) {
        this.Nimi = Nimi;
    }

    public void setOstohinta(Double Ostohinta) {
        this.Ostohinta = Ostohinta;
    }

    public void setVuosi(Integer Vuosi) {
        this.Vuosi = Vuosi;
    }
    
    
    // TULOSTETTAVA VALIKKO KUN OHJELMA KÄYNNISTYY //
    public void tulostaValikko(){
        System.out.println("*********************");
        System.out.println("1. Lisää osake");
        System.out.println("2. Tulosta tuotot");
        System.out.println("3. Tulosta koko lista");
        System.out.println("*********************");
        
    }
    // TÄMÄ KYSYY OSAKKEEN TIEDOT //
    public void kysyOsake(){
       Scanner input = new Scanner(System.in);
        System.out.println("Anna osakkeen nimi: ");
        setNimi(input.nextLine());
        System.out.println("Anna ostohinta: ");
        setOstohinta(input.nextDouble());
        System.out.println("Anna tuottoprosentt: ");
        setProsentti(input.nextDouble());
        System.out.println("Anna ajanjakso vuosina: ");
        setVuosi(input.nextInt());
        
        
    }
    // KUTSUTAAN TUOTON LASKUUN TARVITTAVT METODIT JA TULOSTETAAN TUOTOT //
    public void tulostaArvo(){
        
        Double ekaVuosi = laskeTuottoYhdelleVuodelle(getOstohinta(), getProsentti());
        System.out.println("Tuotto Yhdelle vuodelle = " + ekaVuosi + "€");
        Double tuotto = tuottoTuotolle(getOstohinta(), ekaVuosi, getProsentti());
        System.out.println("Tuotto seuravalle vuodelle on = " + tuotto + "€");
        System.out.printf("Säästämisen loppusumma = %.2f €", laskeTuottoTuotolle(getOstohinta(),getProsentti(),getVuosi()));
        System.out.println(System.getProperty("line.separator")); 
        
    }
    // ALLA OLEVAT METODIT LASKEVAT TUOTTOJA // 
    private Double laskeTuottoYhdelleVuodelle(Double o, Double p){
       
        return p/100 * o;
        
    }
    private Double laskeTuottoTuotolle(Double o, Double p, Integer v){
       
        return o* Math.pow(1+p/100, v);
        
    }
    private static Double tuottoTuotolle(Double osto, Double tuotto, Double pros){
        
        Double seuraavaTuotto = osto + tuotto;
        seuraavaTuotto = pros/100 * seuraavaTuotto;
        return seuraavaTuotto;
        
    }
    
    
}
