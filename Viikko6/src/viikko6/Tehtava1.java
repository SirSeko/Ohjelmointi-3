/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko6;

import java.util.Scanner;

/**
 *
 * @author s717467
 */
public class Tehtava1 {

    public static void main(String[] args) {
        int saie;
        PrintDiamond pd = new PrintDiamond();
        Scanner input = new Scanner(System.in);
        System.out.println("Montako timangia tulostetaan?");
        saie = input.nextInt();
        input.nextLine();
        OmaRunnable oma = new OmaRunnable(saie, pd);
        Thread th = new Thread (oma);
        
        OmaThread oma2 = new OmaThread(saie, pd );
        oma2.start();
        th.start();
        input.close();
    }
    
}
