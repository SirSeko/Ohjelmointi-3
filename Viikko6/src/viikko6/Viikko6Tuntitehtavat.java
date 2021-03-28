/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6;

/**
 *
 * @author s717467
 */
public class Viikko6Tuntitehtavat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2 tapaa ajaa säie!
        // Ajetaan ohjelma omassa säikeessä nääin
        OmaRunnable oma = new OmaRunnable(3);
        Thread th = new Thread(oma); //<== laitetaan oma runnable threadiin
        th.start();
        
        //Ajetaan omassa luokassa joka sisältää jo threadin
        OmaThread oma2 = new OmaThread();
        oma2.start();
        
        //Anonyymi luokka voidaan luoda suoraan mainiin. 
        Thread uusin = new Thread(){
            @Override
            public run(){
                System.out.println("Ajetaan tämä");
            }
        }
        uusin.start();
    }
    public void setVuosiKorko (double vuosikorko) throws ArithmeticException{
        if (vuosikorko <0) {
            throw new ArithmeticException();
        }
        boolean korko = false;
        do {
            try {
                //Katsotaan onko korko ok parsettamalla
                //jos ok niin korko = true;
            } catch (ArithmeticException e) {
                // sysprint Vuosikorko ei voi olla negatiivinen
                //korko = false;
            }
        } while (korko = false);
    }
} /// POISTA KOOSTELUOKASTA PUBLIC PUHELIN CONSTRUCTORI <== EI TARVITA


//public class OmaRunnable implements Runnable{
   //int parametri;
// public OmaRunnable(final int omaparametri){
//}
//@Override
//public void run(){
//koodi tähän
//}

//}

//public class OmaThread extends Thread{
// int parametri
//public OmaThread(int parametri)
//this.parametri = parametri;
    // Override
    //public void run(){
    //koodi tähän
    //}
//}