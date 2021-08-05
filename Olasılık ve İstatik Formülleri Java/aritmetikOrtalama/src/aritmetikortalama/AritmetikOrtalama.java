/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetikortalama;

import java.util.Scanner;

/**
 *
 * @author Aleyna
 */
public class AritmetikOrtalama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
            Scanner s=new Scanner(System.in);
         System.out.println("örneklem degerini girin");
        double  n=s.nextDouble();
         
        double topla=0;

        for(int i=0;i<n;i++){
          
                Scanner al=new Scanner(System.in);
                        System.out.println("sayi girininz:");

                            int sayi=al.nextInt();
                                topla=topla+sayi;
            
                                                 
                                                    
                                                            }
                                                            double ort=topla/n;
                                                        System.out.println("Sayilarin Ortalamasi :"+ort);
              System.out.println(s.nextInt());                                       
        }
    

}

       
    

