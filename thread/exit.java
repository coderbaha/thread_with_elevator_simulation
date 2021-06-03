/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_2;

import java.util.Random;

/**
 *
 * @author bahaa
 */
public class exit extends Thread {
    public synchronized void ex() {
		
		
		try {
			Thread.sleep(1000);
			Random rnd = new Random();
			int k = 1+rnd.nextInt(5);
                        
			for(int i=0;i<k;i++){
                        int k1=1+rnd.nextInt(4);
                        if(proje.mevcutkat.get(k1)>0 && k1<proje.mevcutkat.get(k1)){
                        proje.cikiskuyruk.add(k1);
                        }
                        else{
                            k1=1+rnd.nextInt(4);                          
                            while(proje.mevcutkat.get(k1)==0 || k1>proje.mevcutkat.get(k1)){
                            k1=1+rnd.nextInt(4);
                            }
                            proje.cikiskuyruk.add(k1);
                            
                        }
                       }
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public void run() {
		
		while(true) {
                 
		ex();
			
		}
}
}


