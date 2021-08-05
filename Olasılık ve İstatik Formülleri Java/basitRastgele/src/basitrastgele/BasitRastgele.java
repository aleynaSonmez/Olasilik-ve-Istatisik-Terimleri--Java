/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basitrastgele;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aleyna
 */
public class BasitRastgele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner deger = new Scanner(System.in);
        System.out.println("Max sayi degerini giriniz:");
        int max = deger.nextInt();
        System.out.println("Min sayi degerini giriniz:");
        int min = deger.nextInt();
        System.out.println("Kac tane sayi uretilecek giriniz:");
        int uretilen = deger.nextInt();
        int[] a = new int[uretilen];
        if ((max - min) + 1 <= uretilen) {
            for (int i = 0; i < uretilen; i++) {
                    a[i] = (int) (Math.random() * ((max - min) + 1)) + min;
            }
            for(int i = 0; i<uretilen;i++){
                System.out.print(a[i]+"  ");
            }
        } else if((max-min)+1 >= uretilen){
           
            int b[] = new int[(max - min) + 1];
            int baslangic = 0;
            for(int i = min; i<=max; i++){
                b[baslangic] = i;
                baslangic++;
            }
            
            shuffleArray(b);
            for (int i = 0; i < uretilen; i++) {
                System.out.print(b[i]+"  ");
            }
        }

        System.out.println(deger.nextInt());
    }
  public static void shuffleArray(int[] ar)
  {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
                    }
                    }
    
    

