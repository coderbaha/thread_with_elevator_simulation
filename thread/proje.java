/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_2;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author bahaa
 */
public class proje{
    public static int temp=0;
    public static ArrayList<Integer> mevcutkat;
    public static ArrayList<Integer> asansörkuyruk;
    public static ArrayList<Integer> cikiskuyruk;
    public static asansor a1=new asansor();
    public static asansor a2=new asansor();
    public static asansor a3=new asansor();
    public static asansor a4=new asansor();
    public static asansor a5=new asansor();
    public static boolean kontrol_a2=false;
    public static boolean kontrol_a3=false;
    public static boolean kontrol_a4=false;
    public static boolean kontrol_a5=false;
/**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        cikiskuyruk=new ArrayList();
        mevcutkat=new ArrayList();
        mevcutkat.add(0);
        mevcutkat.add(0);
        mevcutkat.add(0);
        mevcutkat.add(0);
        mevcutkat.add(0);
        asansörkuyruk=new ArrayList();
        
        login l=new login();
        l.start();
        a1.start();
        a1.mode=true;
        a2.start();
        a2.suspend();
        a3.start();
        a3.suspend();
        a4.start();
        a4.suspend();
        a5.start();
        a5.suspend();
        
        exit e=new exit();
        e.start();
        
        
        kontrol k=new kontrol();
        k.start();
        
        
    }

    
}
