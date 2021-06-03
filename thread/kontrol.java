/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bahaa
 */
public class kontrol extends Thread{
    public synchronized void kont() {
			
        try {
            Thread.sleep(3000);
                    if(proje.asansörkuyruk.size()+proje.cikiskuyruk.size()>20){
                        proje.temp+=1;
                        //System.out.println("toplam kuyruk:"+(proje.asansörkuyruk.size()+proje.cikiskuyruk.size()));
                        
                        if(proje.temp==1){
                        proje.kontrol_a2=true;
                        }
                        if(proje.temp==2){
                        proje.kontrol_a3=true;
                        }
                        if(proje.temp==3){
                        proje.kontrol_a4=true;
                        }
                        if(proje.temp==4){
                        proje.kontrol_a5=true;
                        }
                        if(proje.kontrol_a2==true && proje.temp==1){
                        proje.a2.mode=true;
                        proje.a2.resume();
                        proje.a2.kat=0;
                        }
                        if(proje.kontrol_a3==true&& proje.temp==2){
                        proje.a3.mode=true;
                        proje.a3.resume();
                        proje.a3.kat=0;
                        }
                        if(proje.kontrol_a4==true &&proje.temp==3){
                        proje.a4.mode=true;
                        proje.a4.resume();
                        proje.a4.kat=0;
                        }
                        if(proje.kontrol_a5==true&& proje.temp==4){
                        proje.a5.mode=true;
                        proje.a5.resume();
                        proje.a5.kat=0;
                        }
                        }
                        if(proje.asansörkuyruk.size()+proje.cikiskuyruk.size()<=10){
                        proje.temp-=1;
                        if(proje.temp==0){
                        proje.kontrol_a2=false;
                        }
                        if(proje.temp==1){
                        proje.kontrol_a3=false;
                        }
                        if(proje.temp==2){
                        proje.kontrol_a4=false;
                        }
                        if(proje.temp==3){
                        proje.kontrol_a5=false;
                        }
                        if(proje.kontrol_a2==false && proje.temp==0){
                        proje.a2.mode=false;
                        proje.a2.suspend();
                        proje.a2.kat=0;
                        }
                        if(proje.kontrol_a3==false&& proje.temp==1){
                        proje.a3.mode=false;
                        proje.a3.suspend();
                        proje.a3.kat=0;
                        }
                        if(proje.kontrol_a4==false &&proje.temp==2){
                        proje.a4.mode=false;
                        proje.a4.suspend();
                        proje.a4.kat=0;
                        }
                        if(proje.kontrol_a5==false&& proje.temp==3){                       
                        proje.a5.mode=false;
                        proje.a5.suspend();
                        proje.a5.kat=0;
                        }
                        
                        }
                        for(int i=1;i<5;i++){System.out.println(i+".kat kişi sayısı: "+proje.mevcutkat.get(i));}
                        if(proje.a1.mode==true){
                        System.out.println("1.asansör aktif ");
                        System.out.println("1.asansör kat: "+proje.a1.kat);
                        System.out.println("1.asansör yön: "+proje.a1.yon);  
                        //System.out.println("1.asansor kapasite: "+proje.a1.kapasite);
                        try {
                        if(proje.a1.yon.equals("up")){
                        System.out.println("1.asansördeki insan sayısı: "+proje.a1.kapasite);
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a1.kapasite;i++){                        
                        System.out.print(proje.a1.hedefkat.get(i)+",");
                        }
                            System.out.println(")");
                        }                            
                        if(proje.a1.yon.equals("down")){
                        System.out.println("1.asansördeki insan sayısı: "+proje.a1.cikishedef.size());
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a1.cikishedef.size();i++){                       
                            System.out.print(proje.a1.cikishedef.get(i)+",");
                        }
                            System.out.println(")");
                        }
                            } catch (Exception e) {
                            }
                        
                        }
                        if(proje.a2.mode==true){
                        System.out.println("2.asansör aktif ");
                        System.out.println("2.asansör kat: "+proje.a2.kat);
                        System.out.println("2.asansör yön: "+proje.a2.yon);        
                        //System.out.println("2.asansor kapasite: "+proje.a2.kapasite);
                        try {
                        if(proje.a2.yon.equals("up")){
                        System.out.println("2.asansördeki insan sayısı: "+proje.a2.kapasite);
                        System.out.print("asansördekiler:(");
                        
                        for(int i=0;i<proje.a2.kapasite;i++){
                        System.out.print(proje.a2.hedefkat.get(i)+",");                       
                        }
                        System.out.println(")");
                        }                                                                               
                        if(proje.a2.yon.equals("down")){
                        System.out.println("2.asansördeki insan sayısı: "+proje.a2.cikishedef.size());
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a2.cikishedef.size();i++){
                        System.out.print(proje.a2.cikishedef.get(i)+",");
                        }
                            System.out.println(")");
                        }
                            } catch (Exception e) {
                            }
                        
                        
                        }
                        if(proje.a2.mode==false){
                        System.out.println("2.asansör pasif ");
                        System.out.println("2.asansör kat: "+proje.a2.kat); 
                        }
                        if(proje.a3.mode==true){
                        System.out.println("3.asansör aktif ");
                        System.out.println("3.asansör kat: "+proje.a3.kat);
                        System.out.println("3.asansör yön: "+proje.a3.yon); 
                        //System.out.println("3.asansor kapasite: "+proje.a3.kapasite);
                        
                        try {
                        if(proje.a3.yon.equals("up")){
                        System.out.println("3.asansördeki insan sayısı: "+proje.a3.kapasite);
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a3.kapasite;i++){                           
                        System.out.print(proje.a3.hedefkat.get(i)+",");
                        }                       
                        System.out.println(")");
                        }
                           
                        if(proje.a3.yon.equals("down")){
                        System.out.println("3.asansördeki insan sayısı: "+proje.a3.cikishedef.size());
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a3.cikishedef.size();i++){
                        System.out.print(proje.a3.cikishedef.get(i)+",");
                        }
                            System.out.println(")");
                        }
                        } catch (Exception e) {
                        }
                        
                        }
                        if(proje.a3.mode==false){
                        System.out.println("3.asansör pasif ");
                        System.out.println("3.asansör kat: "+proje.a3.kat);
                        }
                        if(proje.a4.mode==true){
                        System.out.println("4.asansör aktif ");
                        System.out.println("4.asansör kat: "+proje.a4.kat);
                        System.out.println("4.asansör yön: "+proje.a4.yon); 
                        //System.out.println("4.asansor kapasite: "+proje.a4.kapasite);
                        try {
                        if(proje.a4.yon.equals("up")){
                        System.out.println("4.asansördeki insan sayısı: "+proje.a4.kapasite);
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a4.kapasite;i++){                       
                        System.out.print(proje.a4.hedefkat.get(i)+",");
                        }                       
                        System.out.println(")");
                        }      
                        if(proje.a4.yon.equals("down")){
                        System.out.println("4.asansördeki insan sayısı: "+proje.a4.cikishedef.size());
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a4.cikishedef.size();i++){
                        System.out.print(proje.a4.cikishedef.get(i)+",");
                        }
                        System.out.println(")");
                        }
                        } catch (Exception e) {
                        }
                        }
                        if(proje.a4.mode==false){
                        System.out.println("4.asansör pasif ");
                        System.out.println("4.asansör kat: "+proje.a4.kat);
                        }
                        if(proje.a5.mode==true){
                        System.out.println("5.asansör aktif ");
                        System.out.println("5.asansör kat: "+proje.a5.kat);
                        System.out.println("5.asansör yön: "+proje.a5.yon); 
                        //System.out.println("5.asansor kapasite: "+proje.a5.kapasite);
                        try {
                        if(proje.a5.yon.equals("up")){
                        System.out.println("5.asansördeki insan sayısı: "+proje.a5.kapasite);
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a5.kapasite;i++){                        
                        System.out.print(proje.a5.hedefkat.get(i)+",");
                        }
                        System.out.println(")");
                        }                      
                        if(proje.a5.yon.equals("down")){
                        System.out.println("5.asansördeki insan sayısı: "+proje.a5.cikishedef.size());
                        System.out.print("asansördekiler:(");
                        for(int i=0;i<proje.a5.cikishedef.size();i++){
                        System.out.print(proje.a5.cikishedef.get(i)+",");
                        }
                            System.out.println(")");
                        }
                        } catch (Exception e) {
                        }                        
                  }
            
            
                       /* int kat_1=0;
                        int kat_2=0;
                        int kat_3=0;
                        int kat_4=0;
                        for(int i=0;i<proje.asansörkuyruk.size();i++){
                        if(proje.asansörkuyruk.get(i)==1){kat_1++;}
                        if(proje.asansörkuyruk.get(i)==2){kat_2++;}
                        if(proje.asansörkuyruk.get(i)==3){kat_3++;}
                        if(proje.asansörkuyruk.get(i)==4){kat_4++;}
                        }
                        int ckat_1=0;
                        int ckat_2=0;
                        int ckat_3=0;
                        int ckat_4=0;
                        for(int i=0;i<proje.cikiskuyruk.size();i++){
                        if(proje.cikiskuyruk.get(i)==1){ckat_1++;}
                        if(proje.cikiskuyruk.get(i)==2){ckat_2++;}
                        if(proje.cikiskuyruk.get(i)==3){ckat_3++;}
                        if(proje.cikiskuyruk.get(i)==4){ckat_4++;}
                        }*/
                        
                        
                       /* System.out.println("1.kat yolcu sayısı: "+kat_1);
                        System.out.println("2.kat yolcu sayısı: "+kat_2);
                        System.out.println("3.kat yolcu sayısı: "+kat_3);
                        System.out.println("4.kat yolcu sayısı: "+kat_4);
                         
                        System.out.println("Yukarı cıkmayı bekleyen toplam sayı: "+proje.asansörkuyruk.size());
                        System.out.println("Aşagıya inmeyi bekleyen toplam sayı: "+proje.cikiskuyruk.size());                                
                        
                        System.out.println("1.kat tan giden sayı: "+ckat_1);
                        System.out.println("2.kat tan giden sayı: "+ckat_2);
                        System.out.println("3.kat tan giden sayı: "+ckat_3);
                        System.out.println("4.kat tan giden sayı: "+ckat_4);*/
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(kontrol.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
                        
                        
                        
		
		
	}
public void run(){
while(true) {
                 
		kont();
			
		}
}
}