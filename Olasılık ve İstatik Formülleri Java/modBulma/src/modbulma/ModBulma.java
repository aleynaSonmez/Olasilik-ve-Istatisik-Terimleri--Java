/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modbulma;

import java.util.Scanner;

/**
 *
 * @author Aleyna
 */
public class ModBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int mod =0;
       int sayac;
       int boyut;
        System.out.println("boyut giriniz:");
       Scanner s = new Scanner(System.in);
       boyut=s.nextInt();
       int[] dizi= new int [boyut];
       
       for(int i=0;i<dizi.length;i++){
           System.out.println((i+1)+". degeri giriniz:");
           dizi[i]=s.nextInt();//dizinin içerisine aldığımız değerleri atadık.
       }
       int modDeger=dizi[0];
       
       for(int j=0;j<dizi.length;j++){
           sayac =0;
       for(int k=0;k<dizi.length;k++)
       {
           if(dizi[k]==dizi[j]){
               sayac++;
           }
           if(sayac>mod){
               mod =sayac;
               modDeger =dizi[j];
           }
       }       
       
    }
       
        System.out.println("dizinin mod değeri:"+modDeger);
        
System.out.println(s.nextInt());
    }
}
