/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basitseri;

import java.util.Scanner;

public class BasitSeri {
     
     public static void selectionSort(int [] dizi,int n)
    {
        
        
        for(int i=0; i<(dizi.length)-1; i++)
        {
           
            for(int j=i; j<dizi.length; j++)
            {
                if (dizi[i] < dizi[j]){
                    int x =dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=x; 
                    //System.out.println(dizi[i]);
                  
                }
                  
            }
           
            
        }  
        }
      
    public static void main(String[] args) {
        System.out.println("örneklem sayisini giriniz:");
        Scanner input3 = new Scanner(System.in);
        int n = input3.nextInt();
        System.out.println("Örneklem Sayisi=" + n);
        
        
        
        
    int [] dizi= new int[(int) n];
    for(int i=0;i<n;i++){
        System.out.println("sayiyi giriniz:");
       
        int sayi =input3.nextInt(); 
        dizi[i]=sayi;
        System.out.println("veri:"+sayi);
        
            selectionSort(dizi, n);
                    }
      
               for(int j=0;j<n;j++){
                    System.out.println(dizi[j]);
                } 
                        
          int temp1=0;int maxSayi=0;
          for(int j=0;j<dizi.length;j++)
     {
   for(int y=1;y<dizi.length;y++) 
   { 
      if(dizi[y-1]>dizi[y])
      {
        temp1=dizi[y];
        dizi[y]=dizi[y-1];
        dizi[y-1]=temp1;
      }
   }
   
}
System.out.println("Kücükten Büyüğe Sıralama:");
for(int i=0;i<dizi.length;i++)
{
   System.out.print(dizi[i]+" ");
     maxSayi=dizi[i] ;
}  
               
         System.out.println(input3.nextInt());
    
   
   
    }
   
 
}
