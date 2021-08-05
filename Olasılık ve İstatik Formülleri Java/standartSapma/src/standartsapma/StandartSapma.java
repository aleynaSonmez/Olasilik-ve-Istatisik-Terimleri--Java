/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standartsapma;

import java.util.Scanner;

/**
 *
 * @author Aleyna
 */
public class StandartSapma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("kaç tane sayı girilecek:");
        int sayi= s.nextInt();
        double dizi[]= new double[sayi];
        for(int i=0;i<sayi;i++)
        {
            System.out.println((i+1) +".sayiyi girin");
            dizi[i]=s.nextInt();
        }
        System.out.println("girdiğiniz sayilar:");
        for(int i=0;i<sayi;i++){
            System.out.println(dizi[i] +"  ");
        }
        double StandartSapma = standartSapmaHesapla(dizi);
      
        System.out.format("\n Sayıların Standart Sapması = %.6f \n", StandartSapma);
        
System.out.println(s.nextInt());
        
 
      
    }
       public static double standartSapmaHesapla(double[] sayilar) {

    double toplam = 0;
    double sapma = 0; 

    for (int i = 0; i < sayilar.length; i++) {
    	toplam += sayilar[i];
    }
    double mean = toplam / (sayilar.length); 

    for (int j = 0; j < sayilar.length; j++) {
        sapma +=  Math.pow((sayilar[j] - mean), 2); 
    }
    
    double karelerToplamiOrtalamasi = (sapma) / (sayilar.length-1); 
    double standartSapma = (Math.sqrt(karelerToplamiOrtalamasi)); 
   
    return standartSapma; 
    
}
}
