package proje_2;

import java.util.ArrayList;
import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bahaa
 */
public class login extends Thread {
    
 public synchronized void log() {
     
		
		
		try {
			Thread.sleep(500);
			Random rnd = new Random();
			int k = 1+rnd.nextInt(10); 
                        for(int i=0;i<k;i++){
                        int k1=1+rnd.nextInt(4);
                        proje.asansörkuyruk.add(k1);
                        }	
                        
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public void run() {
		
		while(true) {
                 
		log();
			
		}
}
}


