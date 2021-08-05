/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematikrasgele;

import java.util.Scanner;

/**
 *
 * @author Aleyna
 */
public class SistematikRasgele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
       System.out.println("kitle degerini girin");
        double N=s.nextDouble();
        System.out.println("örneklem degerini girin");
        double  n=s.nextDouble();
         
         double k= (int)(N/n);
         System.out.println("k nin degeri="+k);
         
         
         
         int [] dizi = new int[(int) n];
         dizi[0] =(int) (Math.random() * ((k-1)+1))+1;
         System.out.println("random sayi="+dizi[0]);
         
         for(int i=1;i<n;i++){
             dizi[i]= (int) (dizi[i-1]+k);
             
                     }
        for(int j=0;j<n;j++){
            System.out.println((j+1)+". sayisi:"+dizi[j]);
            
        }
        
System.out.println(s.nextInt());
    }
    
}
