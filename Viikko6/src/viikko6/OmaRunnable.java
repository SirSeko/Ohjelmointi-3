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
public class OmaRunnable implements Runnable {
    private int parametri;
    private PrintDiamond pd;
    public OmaRunnable(final int parametri, PrintDiamond pd){
        this.parametri = parametri;
        this.pd = pd;
    }
    @Override
    public void run() {
    	synchronized(pd){
    		for (int i = 0; i < parametri; i++) {
    			pd.print();
    			System.out.println("Tulostettu Runnablessa!");
    		 }
    	
    	}
      
    }
    
    
}
