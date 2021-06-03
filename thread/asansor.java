/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author bahaa
 */
public class asansor extends Thread {
    
    String yon="up";
    boolean up;
    boolean down;
    boolean mode;
    int kat=0;
    int kapasite;
    public ArrayList<Integer> hedefkat;
    public ArrayList<Integer> cikishedef;
    public ArrayList<Integer> templ;
    public asansor(){  
    up=false;
    down=false;
    hedefkat=new ArrayList();
    cikishedef=new ArrayList();
    templ=new ArrayList();
    }
public synchronized void ust() {
		
		
		try {
                        
			Thread.sleep(200);
                        
                        if(kat==0){
                        yon="up";
                        up=true;
                        down=false;
                        }
                        if(kat==4){
                        yon="down";
                        up=false;
                        down=true;
                        }
                        
                        if(kat==0){
                            for(int a=0;a<cikishedef.size();a++){
                            cikishedef.remove(a);
                            }
                            if(proje.asansörkuyruk.size()>=10){
                            kapasite=10;
                            }
                            else{
                            kapasite=proje.asansörkuyruk.size();
                            }
                            for(int c=0;c<kapasite;c++){
                            hedefkat.add(proje.asansörkuyruk.get(0));
                            proje.asansörkuyruk.remove(0);
                            }
                        
                        }
                        
                        for(int a=hedefkat.size()-1;a>=0;a--){                       
                        if(kat==hedefkat.get(a)){ 
                        hedefkat.remove(a);
                        kapasite--;
                        proje.mevcutkat.set(kat,proje.mevcutkat.get(kat)+1);
                        }
                        }
                        if(kat==4){
                        if(proje.cikiskuyruk.size()>=10){
                        kapasite=10;
                        }
                        else{
                        kapasite=proje.cikiskuyruk.size();
                        }
                        }
                        if(yon.equals("down")==true){
                        for(int c=kapasite;c>=0;c--){
                            try {
                                if (kat==proje.cikiskuyruk.get(c) && cikishedef.size()<kapasite) {
                                cikishedef.add(proje.cikiskuyruk.get(c));
                                templ.add(proje.cikiskuyruk.get(c));
                                proje.cikiskuyruk.remove(c);
                            } 
                            } catch (Exception e) {
                            }
                            
                            
                            
                        }
                        }
                                                
                        if(up==true){
                            if(kat<=4){
                        kat+=1;}
                        }
                        else{
                            if(kat>=0){
                            kat-=1;}
                        }
                        
                               
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public void run() {
		
		while(true) {
                 
		ust();
		
		}
}
}	