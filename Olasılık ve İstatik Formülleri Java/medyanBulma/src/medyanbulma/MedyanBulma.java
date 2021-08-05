/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medyanbulma;

import java.util.Scanner;

/**
 *
 * @author Aleyna
 */
public class MedyanBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("kaç tane sayı girilecek:");
        int sayi= s.nextInt();
        int liste[]= new int[sayi];
        for(int i=0;i<sayi;i++)
        {
            System.out.println((i+1) +".sayiyi girin");
            liste[i]=s.nextInt();
        }
        System.out.println("girdiğiniz sayilar:");
        for(int i=0;i<sayi;i++){
            System.out.println(liste[i] +"  ");
        }
       
            selectionSort(liste);
            System.out.println("medyan:");
         //tek sayili bir dizi ise
            
            if(liste.length%2==1)
            {
                int tekliSira=(liste.length+1)/2;
                System.out.println(liste[tekliSira-1]);//indislerden dolayı
                } 
            
            //cift ise
            else
                    {
                double ciftliSira=(liste.length)/2;
                        double ortaSayi = (liste[(int) ciftliSira - 1] + liste[(int) ciftliSira])/2.0;
                            System.out.println(ortaSayi);
            }
           
System.out.println(s.nextInt()); 
      
   
    }
        public static void selectionSort(int[] liste) {
        int temp=0;
          for(int j=0;j<liste.length;j++)
{
   for(int k=1;k<liste.length;k++) 
   { 
      if(liste[k-1]>liste[k])
      {
        temp=liste[k];
        liste[k]=liste[k-1];
        liste[k-1]=temp;
      }
   }
   
}
System.out.println("Kücükten Büyüğe sıralama");
for(int i=0;i<liste.length;i++)
{
   System.out.print(liste[i]+" ");
}
    }
}



