/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frekansserisi;


import static java.nio.file.Files.list;
import java.util.*;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author Aleyna
 */
public class FrekansSerisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("kaç tane sayı girilecek:");
        int sayi= s.nextInt();
        int arr[]= new int[sayi];
        for(int i=0;i<sayi;i++)
        {
            System.out.println((i+1) +".sayiyi girin");
            arr[i]=s.nextInt();
        }
        System.out.println("girdiğiniz sayilar:");
        for(int i=0;i<sayi;i++){
            System.out.println(arr[i] +"  ");
            
        }
          int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;    
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  System.out.println("---------------------------------------");  
        System.out.println(" SAYI | FREKANS ");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
          }  
        System.out.println("----------------------------------------");  
       System.out.println(s.nextInt());
    }
}
